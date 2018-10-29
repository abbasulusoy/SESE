import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Customer } from '../models/customer.model';
import {CustomerService} from './customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styles: []
})
export class CustomerComponent implements OnInit {

  customers: Customer[];

  constructor(private router: Router, private customerService: CustomerService) {

  }

  ngOnInit() {
    this.customerService.getCustomers()
      .subscribe( data => {
        this.customers = data;
      });
  };

  deleteCustomer(customer: Customer): void {
    this.customerService.deleteCustomer(customer)
      .subscribe( data => {
        this.customers = this.customers.filter(u => u !== customer);
      })
  };

}


