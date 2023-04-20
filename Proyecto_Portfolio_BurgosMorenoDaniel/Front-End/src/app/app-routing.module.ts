import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginEnterComponent } from './components/login-enter/login-enter.component';
import { LoginRegisterComponent } from './components/login-register/login-register.component';


const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'login',component: LoginEnterComponent },
  {path:'register',component: LoginRegisterComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
