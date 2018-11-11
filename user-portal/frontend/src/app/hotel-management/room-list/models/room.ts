export enum RoomType {
  EZ = 'EZ',
  DZ = 'DZ',
  VIP = 'VIP'
}

export class Room {
  id: number;
  name: string;
  type: RoomType;
  description: string;
  mainPicture: string;
  capacity: number;
  price: number;
}
