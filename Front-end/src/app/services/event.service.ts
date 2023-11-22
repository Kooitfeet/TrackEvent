import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Event} from "../models/event.model";

@Injectable({
  providedIn: 'root'
})
export class EventService {

  private backendUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) {}
  findAll(): Observable<Event[]> {
    return this.http.get<Event[]>(this.backendUrl + '/events/all');
  }
}
