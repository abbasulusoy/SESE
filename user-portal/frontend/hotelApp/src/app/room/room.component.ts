import { Component, OnInit } from '@angular/core';
import {Room} from "../models/room.model";
import {Router} from "@angular/router";
import {RoomService} from "./room.service";

@Component({
  selector: 'app-room',
  templateUrl: './room.component.html',
  styleUrls: ['./room.component.css']
})
export class RoomComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  rooms: Room[];

  constructor(private router: Router, private roomService: RoomService) {

  }

  ngOnInit() {
    this.roomService.getRooms()
      .subscribe( data => {
        this.rooms = data;
      });
  };

  deleteRoom(room: Room): void {
    this.roomService.deleteRoom(room)
      .subscribe( data => {
        this.rooms = this.rooms.filter(u => u !== room);
      })
  };

}
}
