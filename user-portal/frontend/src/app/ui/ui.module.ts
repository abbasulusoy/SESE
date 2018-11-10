import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {LayoutComponent} from './layout/layout.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {FormsModule} from "@angular/forms";
import {RouterModule, Routes} from "@angular/router";
import {RoomListComponent} from "../hotel-management/room-list/room-list.component";
import {CustomerListComponent} from "../hotel-management/customer-list/customer-list.component";

const headerRoutes: Routes = [
  { path: 'roomlist', component: RoomListComponent },
  { path: 'customerlist', component: CustomerListComponent },
];

export const headerRouting = RouterModule.forChild(headerRoutes);

@NgModule({
  declarations: [LayoutComponent, HeaderComponent, FooterComponent],
  imports: [
    CommonModule,
    FormsModule,
    headerRouting
  ],
  exports: [LayoutComponent]
})
export class UiModule { }
