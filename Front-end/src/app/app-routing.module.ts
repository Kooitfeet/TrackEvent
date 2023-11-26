import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeEventsComponent} from "./home-events/home-events.component";
import {NavbarComponent} from "./navbar/navbar.component";
import {ConnexionComponent} from "./connexion/connexion.component";
import {CardEventComponent} from "./card-event/card-event.component";
import {EventDetailComponent} from "./event-detail/event-detail.component";
import {OrganizerProfileComponent} from "./organizer-profile/organizer-profile.component";
import {EventResolver} from "./home-events/event.resolver";
import {MyEventsComponent} from "./my-events/my-events.component";
import {AddEventComponent} from "./add-event/add-event.component";

const routes: Routes = [

  { path: 'navbar', component: NavbarComponent },
  { path: 'connexion', component: ConnexionComponent },
  { path: 'card-event', component: CardEventComponent},
  { path: 'event/:id', component: EventDetailComponent },
  { path: '', component: HomeEventsComponent,
    resolve:
      {
        events: EventResolver
      }
  },
  { path: 'organizer/:id', component: OrganizerProfileComponent },
  { path: 'myevents', component: MyEventsComponent },
  { path: 'addevent', component: AddEventComponent },

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
