import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginEnterComponent } from './components/login-enter/login-enter.component';


const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'login',component: LoginEnterComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
