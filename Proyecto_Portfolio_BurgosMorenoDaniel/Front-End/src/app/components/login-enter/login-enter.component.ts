import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-enter',
  templateUrl: './login-enter.component.html',
  styleUrls: ['./login-enter.component.css']
})
export class LoginEnterComponent {

  constructor(private router:Router) {}

  register()
  {
    this.router.navigate(['/register'])
  }
}
