import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Public} from "../models/public.model";

@Injectable({
  providedIn: 'root'
})
export class PublicService {
  private backendUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) {}
  findAll(): Observable<Public[]> {
    return this.http.get<Public[]>(this.backendUrl + '/public/all');
  }

  findById(id: number): Observable<Public> {
    return this.http.get<Public>(this.backendUrl + `/public/id:${id}`);
  }

  updateListParticipe(id: number, list: number[]){
    return this.http.get<Public>(this.backendUrl + `/public/updateList?id=${id}&list=${list.join(',')}`);
  }


  findByPseudo = (pseudo: string) => {
    return this.http.get<Public>(this.backendUrl + `/public/pseudo:${pseudo}`);
  }

  addPublic(profil: Public){
    return this.http.post<Public>(this.backendUrl  + '/public/save', profil);
  }
}
