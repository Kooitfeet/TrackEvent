import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Event} from "../models/event.model";
import {Orga} from "../models/orga.model";

@Injectable({
  providedIn: 'root'
})
export class OrgaService {
  private backendUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) {}
  findAll(): Observable<Orga[]> {
    return this.http.get<Orga[]>(this.backendUrl + '/orga/all');
  }

  findById(id: number): Observable<Orga> {
    return this.http.get<Orga>(this.backendUrl + `/orga/id:${id}`);
  }
}
