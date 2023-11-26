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
  constructor(private _route: ActivatedRoute, private eventService: EventService, private publicService: PublicService) {}

  ngOnInit() {
    this.publicService.findById(2).subscribe((data) => {
      this.eventsIDs = data.participe;
      this.eventService.findMultipleByIds(this.eventsIDs).subscribe((events: Event[]) => {
        this.eventParticipate$.next(events);
      });
    });
  }
  ButtonParticipate(event: MouseEvent, id: number) {
    const buttonElement = event.currentTarget as HTMLButtonElement;
    if (buttonElement) { //Supprime des favoris
      if (buttonElement.style.backgroundColor === 'red') {
        buttonElement.style.backgroundColor = 'grey';
        let newListParticipate = this.eventsIDs;
        newListParticipate.push(id)
        const indexASupprimer = newListParticipate.indexOf(id);
        if (indexASupprimer !== -1) {
          newListParticipate.splice(indexASupprimer, 1);
        }
        this.publicService.updateListParticipe(id, newListParticipate).subscribe((data) => {
          console.log("Suppression participe");
          this.eventsIDs = newListParticipate
        });

      }
      else { //Ajoute aux favoris
        buttonElement.style.backgroundColor = 'red';
        let newListParticipate = this.eventsIDs;
        newListParticipate.push(id)
        this.publicService.updateListParticipe(id, newListParticipate).subscribe((data) => {
          console.log("Ajout participe");
          this.eventsIDs = newListParticipate
        });
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
        console.log("test requête")




      }
    }
  }

}
