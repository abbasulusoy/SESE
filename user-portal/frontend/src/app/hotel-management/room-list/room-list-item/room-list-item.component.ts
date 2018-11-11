import {Component, Input, OnInit} from '@angular/core';
import {Room} from "../models/room";
import {Router} from "@angular/router";

@Component({
  selector: 'room-list-item',
  templateUrl: './room-list-item.component.html',
  styleUrls: ['./room-list-item.component.css']
})
export class RoomListItemComponent implements OnInit {

  @Input()
  private room: Room;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onShowRoomDetails(selectedRoom: Room) {
    this.router.navigate(['roomdetail/' + selectedRoom.id], {});
  }

  onReserveRoom(selectedRoomId: number) {
    console.log(`Selected room with the id ` + selectedRoomId + ` successfully reserved!`);
  }

}
