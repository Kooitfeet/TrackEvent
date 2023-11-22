import {Component, Input} from '@angular/core';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-login-home',
  templateUrl: './login-home.component.html',
  styleUrls: ['./login-home.component.css']
})
export class LoginHomeComponent {
  @Input() username: string | null = "";
    constructor(private route: ActivatedRoute) {}
    ngOnInit() {
        this.username = this.route.snapshot.paramMap.get('username');
        console.log(this.username);
        if (this.username) {
            console.log('Segment de l\'URL :', this.username);
        }
    }
}
