import {Component, ElementRef, ViewChild} from '@angular/core';
import {ConnexionService} from "../services/connexion.service";
import {Router} from "@angular/router";
import {Public} from "../models/public.model";
import {PublicService} from "../services/public.service";

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent {
  isLoginTab = true; // Pour suivre l'onglet actif, par défaut c'est l'onglet de connexion
  isPublicRegister = true;
  @ViewChild('loginUsernameInput') loginUsernameInput!: ElementRef;

  constructor(private router: Router, private connexionService : ConnexionService, private publicService : PublicService) {
  }
  toggleTab(arg: String) {
    if(arg=="register"){
      this.isLoginTab = false;
    }
    else{
      this.isLoginTab = true;
    }
  }

  changeType(arg: String){
    if(arg =="public"){
      this.isPublicRegister = true;
    }
    else{
      this.isPublicRegister = false;
    }
  }

  Register(){
    if (this.isPublicRegister) {

      let publicUser = {
        pseudo: 'Collectif77',
        mail: 'Collectif77@orange.fr',
        score: 0,
        inter: [],
        participe: [],
        avis: 0,
        pdp: '',
      }

      this.publicService.addPublic(publicUser).subscribe(response => {
        console.log('Utilisateur public créé avec succès');
      });
    } else {
      console.log('A voir ensuite');
    }


  }

  Login(){
    const username = this.loginUsernameInput.nativeElement.value;
    this.connexionService.Login(username);
    this.router.navigate(['/']);
    event?.preventDefault();
  }
}
