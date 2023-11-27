import { Injectable } from "@angular/core"
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot } from "@angular/router"
import { Observable } from "rxjs"
import {EventService} from "../services/event.service";
import {Event} from "../models/event.model";

@Injectable({
  providedIn: "root",
})
export class EventResolver implements Resolve<Event[]> {
  constructor(private eventService: EventService) {
  }

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<Event[]> {
    return this.eventService.findAll()
  }
}
