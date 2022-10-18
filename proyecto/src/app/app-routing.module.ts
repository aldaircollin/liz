import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlumnoComponent } from './alumno/alumno.component';
import { RegistrarComponent } from './alumno/registrar/registrar.component';

const routes: Routes = [
  {
    path:'alumno',
    component: AlumnoComponent
  },

  {
    path:'alumno/registrar',
    component: RegistrarComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
