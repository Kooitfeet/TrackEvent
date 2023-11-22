import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BehaviorSubject, Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ConnexionService {
  private isLoggedIn = new BehaviorSubject<boolean>(false);
  private _username: string = '';

  isConnected:Observable<boolean> = this.isLoggedIn.asObservable()

  get username() {
    return this._username;
  }

  constructor(private http: HttpClient) {}
  Login(value: string) {
    this._username = value;
    this.isLoggedIn.next(true);
  }



}
