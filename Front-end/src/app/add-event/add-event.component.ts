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

      const newEvent = {
        id_orga: 4,
        prix: 10,
        theme: "Pop",
        name: "Solidays ",
        lieu: "Paris",
        date: '2023-07-04',
        description: "Festival",
        affiche: "images/affiche/image01.png"
      };

      this.eventService.addEvent(newEvent).subscribe(response => {
        console.log("event créé avec succès");
      });
    } else {
      console.log('A voir ensuite');
    }
    }

}
