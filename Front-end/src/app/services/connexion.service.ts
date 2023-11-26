import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BehaviorSubject, Observable} from "rxjs";
import {PublicService} from "./public.service";
import {OrgaService} from "./orga.service";

@Injectable({
  providedIn: 'root'
})
export class ConnexionService {
  private isLoggedIn = new BehaviorSubject<boolean>(false);
  private _username: string = '';
  private ID: number = -1;
  private _orga: boolean = false;

  isConnected:Observable<boolean> = this.isLoggedIn.asObservable()

  get username() {
    return this._username;
  }

  get orga(){
    return this._orga;
  }

  constructor(private http: HttpClient, private publicService: PublicService, private orgaService: OrgaService) {
    const storedUsername = localStorage.getItem('username');
    const storedID = localStorage.getItem('id');
    const storedOrga = localStorage.getItem('orga');
    if (storedUsername && storedID) {
      this._username = storedUsername;
      this.ID = parseInt(storedID, 10);
      this._orga = (storedOrga == 'true')
      this.isLoggedIn.next(true);
      console.log(this._orga)
    }
  }
  Login(value: string) {
    this.publicService.findByPseudo(value).subscribe((data) => {
      if(data.id){
      localStorage.setItem('id', (data.id).toString());
      this._username = value;
      localStorage.setItem('username', value);
      this.isLoggedIn.next(true);
      localStorage.setItem('orga', 'false');
      this._orga = false;
      }
    });

    this.orgaService.findByPseudo(value).subscribe((data) => {
      console.log(data);
      if(data.id){
      localStorage.setItem('id', (data.id).toString());
      this._username = value;
      localStorage.setItem('username', value);
      this.isLoggedIn.next(true);
      localStorage.setItem('orga', 'true');
      this._orga = true;
    }
    });
  }

  Logout() {
    this._username = '';
    this.ID = -1;
    this._orga = false;
    this.isLoggedIn.next(false);
    localStorage.removeItem('username');
    localStorage.removeItem('id');
    localStorage.removeItem('orga');
  }



}
