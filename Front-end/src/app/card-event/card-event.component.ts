import {Component, Input} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {map, Observable} from "rxjs";
import {OrgaService} from "../services/orga.service";
import {Orga} from "../models/orga.model";

@Component({
  selector: 'app-card-event',
  templateUrl: './card-event.component.html',
  styleUrls: ['./card-event.component.css']
})
export class CardEventComponent {
  @Input() name = "";
  @Input() lieu = "";
  @Input() id = 0;
  @Input() description = "";
  @Input() prix = 0;
  @Input() date = "";
  @Input() id_orga = 0;
  @Input() name_orga = "";
  @Input() theme = "";
  @Input() affiche = "";

  constructor(private orgaService: OrgaService) {}
  ngOnInit(): void {
    this.orgaService.findById(this.id).subscribe((data) => {
      this.name_orga = data.pseudo;
    });
  }
}
