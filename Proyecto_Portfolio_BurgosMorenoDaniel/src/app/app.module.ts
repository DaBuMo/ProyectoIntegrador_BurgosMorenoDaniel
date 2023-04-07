import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { RedesComponent } from './components/redes/redes.component';
import { BannerComponent } from './components/banner/banner.component';
import { FotoPerfilComponent } from './components/foto-perfil/foto-perfil.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { ListaEmpleosComponent } from './components/lista-empleos/lista-empleos.component';
import { DescripcionExperienciasComponent } from './components/descripcion-experiencias/descripcion-experiencias.component';
import { EstudiosComponent } from './components/estudios/estudios.component';
import { DescripcionEstudiosComponent } from './components/descripcion-estudios/descripcion-estudios.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardAndSoftComponent } from './components/hard-and-soft/hard-and-soft.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { FooterComponent } from './components/footer/footer.component';

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
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
