import {Component, ElementRef, ViewChild} from '@angular/core';
import {ConnexionService} from "../services/connexion.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent {
  isLoginTab = true; // Pour suivre l'onglet actif, par défaut c'est l'onglet de connexion
  @ViewChild('loginUsernameInput') loginUsernameInput!: ElementRef;

  constructor(private router: Router, private connexionService : ConnexionService) {
  }
  toggleTab(arg: String) {
    if(arg=="register"){ //login annonce que le clique était sur le bouton connexion/login
      this.isLoginTab = false;
    }
    else{
      this.isLoginTab = true;
    }
  }

  Login(){
    const username = this.loginUsernameInput.nativeElement.value;
    this.connexionService.Login(username);
    this.router.navigate(['/']);
    event?.preventDefault();
  }
}
