import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Customer } from '../models/customer.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class CustomerService {

  constructor(private http:HttpClient) {}

  private customerUrl = 'http://localhost:8080/portal/customers';
  //private customerUrl = '/api';

  public getCustomers() {
    return this.http.get<Customer[]>(this.customerUrl);
  }

  public deleteCustomer(customer) {
    return this.http.delete(this.customerUrl + "/"+ customer.id);
  }

  public createCustomer(customer) {
    return this.http.post<Customer>(this.customerUrl, customer);
  }

}
