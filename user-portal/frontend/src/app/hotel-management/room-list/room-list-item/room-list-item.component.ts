import {Component, Input, OnInit} from '@angular/core';
import {Room} from "../models/room";

@Component({
  selector: 'room-list-item',
  templateUrl: './room-list-item.component.html',
  styleUrls: ['./room-list-item.component.css']
})
export class RoomListItemComponent implements OnInit {

  @Input()
  private room: Room;

  constructor() { }

  ngOnInit() {
  }

  onReserveRoom(selectedRoomId: number) {
    console.log(`Selected room with the id ` + selectedRoomId + ` successfully reserved!`);
  }

}
