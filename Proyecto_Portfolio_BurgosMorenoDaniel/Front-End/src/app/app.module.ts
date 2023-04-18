import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { BannerComponent } from './components/banner/banner.component';
import { DescripcionEstudiosComponent } from './components/descripcion-estudios/descripcion-estudios.component';
import { DescripcionExperienciasComponent } from './components/descripcion-experiencias/descripcion-experiencias.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { EstudiosComponent } from './components/estudios/estudios.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { FooterComponent } from './components/footer/footer.component';
import { FotoPerfilComponent } from './components/foto-perfil/foto-perfil.component';
import { HardAndSoftComponent } from './components/hard-and-soft/hard-and-soft.component';
import { HeaderComponent } from './components/header/header.component';
import { ListaEmpleosComponent } from './components/lista-empleos/lista-empleos.component';
import { LoginComponent } from './components/login/login.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { RedesComponent } from './components/redes/redes.component';
import { HomeComponent } from './components/home/home.component';
import { LoginEnterComponent } from './components/login-enter/login-enter.component';
// Agregamos el Http Client


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    RedesComponent,
    BannerComponent,
    FotoPerfilComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    ListaEmpleosComponent,
    DescripcionExperienciasComponent,
    EstudiosComponent,
    DescripcionEstudiosComponent,
    HardAndSoftComponent,
    ProyectosComponent,
    FooterComponent,
    LoginComponent,
    HomeComponent,
    LoginEnterComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
