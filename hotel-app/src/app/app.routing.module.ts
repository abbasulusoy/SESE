import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {CustomerComponent } from './customer/customer.component';
import {AddCustomerComponent} from './customer/add-customer.component';

const routes: Routes = [
  { path: 'customers', component: CustomerComponent },
  { path: 'add', component: AddCustomerComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
