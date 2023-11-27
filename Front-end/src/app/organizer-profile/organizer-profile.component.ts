import { Component } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {map, Observable} from "rxjs";
import {Event} from "../models/event.model";
import {Orga} from "../models/orga.model";

@Component({
  selector: 'app-organizer-profile',
  templateUrl: './organizer-profile.component.html',
  styleUrls: ['./organizer-profile.component.css']
})
export class OrganizerProfileComponent {
  constructor(private _route: ActivatedRoute) {
  }
}
