import {Component, Input, OnDestroy, OnInit} from '@angular/core';
import {Room} from "../models/room";
import {Router} from "@angular/router";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {CreateReservationForm, ReservationDTO} from "../models/reservation";
import {FormBuilder, FormGroup} from "@angular/forms";
import {ReservationService} from "../../../services/reservation.service";

@Component({
  selector: 'room-list-item',
  templateUrl: './room-list-item.component.html',
  styleUrls: ['./room-list-item.component.css']
})
export class RoomListItemComponent implements OnInit, OnDestroy {

  @Input()
  private room: Room;

  private reservation: ReservationDTO;
  private reservationForm: FormGroup;

  constructor(private router: Router,
              private fb: FormBuilder,
              private modalService: NgbModal,
              private reservationService: ReservationService) {
  }

  ngOnInit() {
    this.reservation = new ReservationDTO();
    this.initAuctionCreateForm(this.reservation);
  }

  private initAuctionCreateForm(reservation: ReservationDTO): void {
    const createAuctionForm = new CreateReservationForm(reservation, this.fb);
    this.reservationForm = this.fb.group(createAuctionForm);
  }

  onShowRoomDetails(selectedRoom: Room) {
    this.router.navigate(['roomdetail/' + selectedRoom.id], {});
  }

  open(content) {
    this.modalService.open(content, {
      ariaLabelledBy: 'modal-basic-title',
      size: 'lg',
      centered: true
    }).result.then((result) => {
      this.onReserveRoom(result);
    }, (reason) => {
      console.log("Reservation dismissed!");
    });
  }

  onReserveRoom(selectedRoom: Room) {
    console.warn(this.reservationForm.value);
    this.reservation = this.reservationForm.value;
    this.reservation.roomId = selectedRoom.id;
    this.reservationService.reserveRoom(this.reservation).subscribe(reservation => {
      this.reservation = reservation;
      console.log('Reservation ksuccessfully created');
    });
    console.log(`Selected room with the id ` + selectedRoom.id + ` successfully reserved!`);
    this.initAuctionCreateForm(this.reservation);
  }

  ngOnDestroy(): void {
  }
}
