import { Component } from '@angular/core';
import {CardEventComponent} from "../card-event/card-event.component";
import {map, Observable} from "rxjs";
import {ActivatedRoute} from "@angular/router";
import {Event} from "../models/event.model"

@Component({
  selector: 'app-home-events',
  templateUrl: './home-events.component.html',
  styleUrls: ['./home-events.component.css']
})
export class HomeEventsComponent {
  eventList$: Observable<Event[]> = this._route.data.pipe(map((data)=>data["events"]))

  itemsVisibles: number =3;
  afficherPlus() {
    this.itemsVisibles += 2;
  }
  constructor(private _route: ActivatedRoute) {
  }
}
