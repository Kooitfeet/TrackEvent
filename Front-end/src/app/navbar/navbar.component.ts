import {Component, Input} from '@angular/core';
import {ConnexionService} from "../services/connexion.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  isConnected: boolean = false;
  @Input() username: string = '';
  @Input() orga: boolean= false;

  constructor(private router: Router, private connexionService: ConnexionService) {}
  ngOnInit() {
    this.connexionService.isConnected.subscribe((isConnected) => {
      this.isConnected = isConnected;
      if (isConnected) {
        this.username = this.connexionService.username;
        this.orga = this.connexionService.orga;
      }
    });
  }

  Logout(){
    this.connexionService.Logout();
    this.username="";
    this.router.navigate(['/']);

  }
}
