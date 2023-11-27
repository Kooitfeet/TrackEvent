import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {forkJoin, Observable} from "rxjs";
import {Orga} from "../models/orga.model";
import {Public} from "../models/public.model";

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

  findByPseudo = (pseudo: string) => {
    return this.http.get<Public>(this.backendUrl + `/orga/pseudo:${pseudo}`);
  }

  addOrga(profil: Public){
    return this.http.post<Orga>(this.backendUrl  + '/orga/save', profil);
  }
}
