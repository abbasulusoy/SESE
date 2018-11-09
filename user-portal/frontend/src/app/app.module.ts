import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { AppRoutingModule } from './app.routing.module';
import {CustomerService} from './customer/customer.service';
import {HttpClientModule} from "@angular/common/http";
import {AddCustomerComponent} from './customer/add-customer.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    AddCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
