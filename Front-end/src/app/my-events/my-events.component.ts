import { Component } from '@angular/core';
import {BehaviorSubject, map, Observable} from "rxjs";
import {Event} from "../models/event.model";
import {ActivatedRoute} from "@angular/router";
import {OrgaService} from "../services/orga.service";
import {EventService} from "../services/event.service";

@Component({
  selector: 'app-my-events',
  templateUrl: './my-events.component.html',
  styleUrls: ['./my-events.component.css']
})
export class MyEventsComponent {

  eventList$: BehaviorSubject<Event[]> = new BehaviorSubject<Event[]>([]);
  constructor(private _route: ActivatedRoute, private eventService: EventService) {}

  ngOnInit() {
    this.eventService.findAll().subscribe((events: Event[]) => {
        this.eventList$.next(events);
      }
    );
  }
  ButtonParticipate(event: MouseEvent) {
    const buttonElement = event.currentTarget as HTMLButtonElement;

    if (buttonElement) {
      if (buttonElement.style.backgroundColor === 'red') {
        buttonElement.style.backgroundColor = 'grey';
      } else {
        buttonElement.style.backgroundColor = 'red';
      }
    }
  }

  ButtonLike(event: MouseEvent) {
    const buttonElement = event.currentTarget as HTMLButtonElement;

    if (buttonElement) {
      if (buttonElement.style.backgroundColor === 'red') {
        buttonElement.style.backgroundColor = 'grey';
      } else {
        buttonElement.style.backgroundColor = 'red';
      }
    }
  }

}
