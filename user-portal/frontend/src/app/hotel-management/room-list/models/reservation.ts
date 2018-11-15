import {FormBuilder, FormControl, Validators} from "@angular/forms";

export class ReservationDTO {
  id: number;
  roomId: number;
  customerName: string;
  customerEmail: string;
  customerDateOfBirth: Date;
  fromDate: Date;
  toDate: Date;
}

export class CreateReservationForm {
  customerName: FormControl;
  customerEmail: FormControl;
  customerDateOfBirth: FormControl;
  fromDate: FormControl;
  toDate: FormControl;

  constructor(private auction: ReservationDTO, private fb: FormBuilder) {
    this.customerName = this.fb.control(this.auction.customerName, Validators.required);
    this.customerEmail = this.fb.control(this.auction.customerEmail, Validators.compose( [Validators.email, Validators.required]));
    this.customerDateOfBirth = this.fb.control(this.auction.customerDateOfBirth, Validators.required);
    this.fromDate = this.fb.control(this.auction.fromDate);
    this.toDate = this.fb.control(this.auction.toDate);
  }
}
