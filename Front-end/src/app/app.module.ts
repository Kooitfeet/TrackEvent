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
import { LoginHomeComponent } from './login-home/login-home.component';
import { MyEventsComponent } from './my-events/my-events.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeEventsComponent,
    NavbarComponent,
    ConnexionComponent,
    CardEventComponent,
    EventDetailComponent,
    OrganizerProfileComponent,
    LoginHomeComponent,
    MyEventsComponent
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
