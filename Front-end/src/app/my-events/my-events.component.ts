import { Component } from '@angular/core';
import {BehaviorSubject, map, Observable} from "rxjs";
import {Event} from "../models/event.model";
import {ActivatedRoute} from "@angular/router";
import {OrgaService} from "../services/orga.service";
import {EventService} from "../services/event.service";
import {PublicService} from "../services/public.service";

@Component({
  selector: 'app-my-events',
  templateUrl: './my-events.component.html',
  styleUrls: ['./my-events.component.css']
})
export class MyEventsComponent {

  eventParticipate$: BehaviorSubject<Event[]> = new BehaviorSubject<Event[]>([]);
  eventsIDs: number[]= [];
  ID = -1;
  constructor(private _route: ActivatedRoute, private eventService: EventService, private publicService: PublicService) {}

  ngOnInit() {
    this.LoadEvents();
  }

  LoadEvents(){
    const storedUserId = localStorage.getItem('id');
    if (storedUserId) {
      this.ID = parseInt(storedUserId, 10); // Convertir la chaîne en nombre
      this.publicService.findById(this.ID).subscribe((data) => {
        this.eventsIDs = data.participe;
        this.eventService.findMultipleByIds(this.eventsIDs).subscribe((events: Event[]) => {
          this.eventParticipate$.next(events);
        });
      });
    }
  }
  ButtonParticipate(event: MouseEvent, id: number | undefined) {
    const buttonElement = event.currentTarget as HTMLButtonElement;
    if (buttonElement && id) { //Supprime des favoris

        buttonElement.style.backgroundColor = 'grey';
        let newListParticipate = this.eventsIDs;
        const indexASupprimer = newListParticipate.indexOf(id);
        if (indexASupprimer !== -1) {
          newListParticipate.splice(indexASupprimer, 1);
        }
        this.publicService.updateListParticipe(this.ID, newListParticipate).subscribe((data) => {
          console.log("Suppression participe");
          this.eventsIDs = newListParticipate
          console.log(newListParticipate)
          this.LoadEvents();
        });
    }
  }

}
