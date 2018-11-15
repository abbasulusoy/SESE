import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {Location} from "@angular/common";
import {Room} from "../room-list/models/room";
import {ROOMS} from "../room-list/models/mock-room";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";

@Component({
  selector: 'app-room-detail',
  templateUrl: './room-detail.component.html',
  styleUrls: ['./room-detail.component.css']
})
export class RoomDetailComponent implements OnInit {

  room:Room;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private location: Location,
              private modalService: NgbModal) {
  }

  ngOnInit() {
    let roomId = +this.route.snapshot.paramMap.get('id');
    this.room =ROOMS.find(room => room.id == roomId);
    console.log(`Room details of the room with the id ` + roomId + ` requested!`);
  }


}
