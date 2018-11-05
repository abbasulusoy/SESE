import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Room} from '../models/room.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class RoomService {

  constructor(private http:HttpClient) {}

  private roomUrl = 'http://localhost:8080/portal/rooms';
  //private roomUrl = '/api';

  public getRooms() {
    return this.http.get<Room[]>(this.roomUrl);
  }

  public deleteRoom(room) {
    return this.http.delete(this.roomUrl + "/"+ room.id);
  }

  public createRoom(room) {
    return this.http.post<Room>(this.roomUrl, room);
  }

}
