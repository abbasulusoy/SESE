import { Component, OnInit } from '@angular/core';
import {Room} from "./models/room";
import {ROOMS} from "./models/mock-room";

@Component({
  selector: 'app-room-list',
  templateUrl: './room-list.component.html',
  styleUrls: ['./room-list.component.css']
})
export class RoomListComponent implements OnInit {

  availableRooms: Room[] = ROOMS;

  constructor() { }

  ngOnInit() {
  }

}
