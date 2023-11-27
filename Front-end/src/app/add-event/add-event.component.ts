import {Component, ElementRef, ViewChild} from '@angular/core';
import {PublicService} from "../services/public.service";
import {EventService} from "../services/event.service";
import {Event} from "../models/event.model";

@Component({
  selector: 'app-add-event',
  templateUrl: './add-event.component.html',
  styleUrls: ['./add-event.component.css']
})
export class AddEventComponent {
  orgaId = 0;

  @ViewChild('eventNameInput') eventNameInput!: ElementRef;
  @ViewChild('eventThemeInput') eventThemeInput!: ElementRef;
  @ViewChild('eventLocationInput') eventLocationInput!: ElementRef;
  @ViewChild('eventDateInput') eventDateInput!: ElementRef;
  @ViewChild('eventPriceInput') eventPriceInput!: ElementRef;
  @ViewChild('eventDescriptionInput') eventDescriptionInput!: ElementRef;
  @ViewChild('eventPosterInput') eventPosterInput!: ElementRef;

  constructor(private eventService: EventService) {
  }

  createEvent(){
    const orga_id = localStorage.getItem("id");
    if(orga_id) {
      this.orgaId = parseInt(orga_id, 10);

      let newEvent = {
        orga: this.orgaId,
        prix: 0,
        theme: "Techno",
        name: " ",
        lieu: "",
        date: '2024-07-04',
        description: "",
        affiche: "../assets/posters/organik-affiche.jpg"
      };

      const eventName = (document.getElementById('event-name') as HTMLInputElement).value;
      const eventTheme = (document.getElementById('event-theme') as HTMLInputElement).value;
      const eventLocation = (document.getElementById('event-location') as HTMLInputElement).value;
      const eventDate = (document.getElementById('event-date') as HTMLInputElement).value;
      const eventPrice = (document.getElementById('event-price') as HTMLInputElement).value;
      const eventDescription = (document.getElementById('event-description') as HTMLInputElement).value;
      const eventPoster = (document.getElementById('event-poster') as HTMLInputElement).value;

      newEvent.name = eventName;
      newEvent.theme = eventTheme;
      newEvent.lieu = eventLocation;
      newEvent.date = eventDate;
      newEvent.prix = parseInt(eventPrice, 10);
      newEvent.description = eventDescription;

      console.log(newEvent);

      this.eventService.addEvent(newEvent).subscribe(response => {
        console.log("event créé avec succès");

      });
    } else {
      console.log('A voir ensuite');
    }
    }

}
