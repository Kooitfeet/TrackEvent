import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {forkJoin, Observable} from "rxjs";
import {Event} from "../models/event.model";
import {Public} from "../models/public.model";

@Injectable({
  providedIn: 'root'
})
export class EventService {

  private backendUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) {}
  findAll(): Observable<Event[]> {
    return this.http.get<Event[]>(this.backendUrl + '/events/all');
  }
  findById(id: number): Observable<Event> {
    return this.http.get<Event>(this.backendUrl + `/events/id:${id}`);
  }

  findMultipleByIds(ids: number[]): Observable<Event[]> {
    const observables: Observable<Event>[] = ids.map(id => this.http.get<Event>(this.backendUrl + `/events/id:${id}`));

    return forkJoin(observables);
  }

  addEvent(event: any){
    return this.http.post<any>(this.backendUrl  + '/events/save', event);
  }

}
