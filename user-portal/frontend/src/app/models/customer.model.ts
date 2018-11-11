import {Address} from './address.model';
import {Room} from "../hotel-management/room-list/models/room";
import {Reservation} from "./reservation.model";

export class Customer {

  id: string;
  firstName: string;
  lastName: string;
  email: string;
  telefonnummer: string;
  fax: string;
  web: string;
  rabatt: string;
  geburtsdatum: string;
  notiz: string;
  firmenname: string;
  address: Address;
  room: Room;
  reservations: Reservation[];
}
