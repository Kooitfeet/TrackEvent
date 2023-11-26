import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeEventsComponent } from './home-events/home-events.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { CardEventComponent } from './card-event/card-event.component';
import { EventDetailComponent } from './event-detail/event-detail.component';
import { OrganizerProfileComponent } from './organizer-profile/organizer-profile.component';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import { MyEventsComponent } from './my-events/my-events.component';
import { AddEventComponent } from './add-event/add-event.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeEventsComponent,
    NavbarComponent,
    ConnexionComponent,
    CardEventComponent,
    EventDetailComponent,
    OrganizerProfileComponent,
    MyEventsComponent,
    AddEventComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
