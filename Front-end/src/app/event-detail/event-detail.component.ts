import { Component } from '@angular/core';
import {EventService} from "../services/event.service";
import {ActivatedRoute} from "@angular/router";
import {Event} from "../models/event.model";
import format from 'date-fns/format';
import {fr} from "date-fns/locale";
import {OrgaService} from "../services/orga.service";
import {PublicService} from "../services/public.service";

@Component({
  selector: 'app-event-detail',
  templateUrl: './event-detail.component.html',
  styleUrls: ['./event-detail.component.css']
})
export class EventDetailComponent {
  ID = 0;
  name='';
  lieu='';
  description = '';
  date='';
  orga = '';
  orga_id: number=0;
  eventsIDs:number[] = [];
  id_public: number=0;
  theme='';


  constructor(private route: ActivatedRoute, private eventService: EventService, private orgaService: OrgaService, private publicService: PublicService) {

  }

  ngOnInit() {
    const tempId = localStorage.getItem('id');
    if(tempId){
      this.id_public = parseInt(tempId, 10);
    }
    this.route.paramMap.subscribe(params => {
      // @ts-ignore
      this.ID = +params.get('id');
      this.eventService.findById(this.ID).subscribe((data) => {
        this.description = data.description;
        this.lieu = data.lieu;
        this.orga_id = data.orga;
        const date = new Date(data.date.substring(0, 9));
        const formattedDate = format(date, 'EEEE dd LLLL yyyy', { locale: fr });
        this.date = formattedDate;
        this.name = data.name;
        this.theme = data.theme;
        this.orgaService.findById(data.orga).subscribe((dataorga) => {
          this.orga = dataorga.pseudo;
        });
      });
    });
  }

  ButtonParticipate(event: MouseEvent) {
    const storedUserId = localStorage.getItem('id');
    if (storedUserId) {
      this.id_public = parseInt(storedUserId, 10); // Convertir la chaîne en nombre
      this.publicService.findById(this.id_public).subscribe((data) => {
        this.eventsIDs = data.participe;
        let newListParticipate = this.eventsIDs;
        console.log(newListParticipate)
        newListParticipate.push(this.ID);
        console.log(newListParticipate)
        this.publicService.updateListParticipe(this.id_public, newListParticipate).subscribe((data) => {
          console.log("Ajout participe");
          this.eventsIDs = newListParticipate;
        });
      });
    }


  }
}

