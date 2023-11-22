import {Component, Input} from '@angular/core';
import {ConnexionService} from "../services/connexion.service";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  isConnected: boolean = false;
  @Input() username: string = '';

  constructor(private connexionService: ConnexionService) {}
  ngOnInit() {
    this.connexionService.isConnected.subscribe((isConnected) => {
      this.isConnected = isConnected;
      if (isConnected) {
        this.username = this.connexionService.username;
      }
    });
  }
}
