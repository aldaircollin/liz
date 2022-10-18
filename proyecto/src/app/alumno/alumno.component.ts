import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Alumno } from './alumno';
import { AlumnoService } from './alumno.service';

@Component({
  selector: 'app-alumno',
  templateUrl: './alumno.component.html',
  styleUrls: ['./alumno.component.css']
})
export class AlumnoComponent implements OnInit {
  alumno:Alumno[];
  constructor(private alumnoService:AlumnoService,private router:Router) { }

  ngOnInit(): void {
    this.obtenerAlumnos();
  }

  private obtenerAlumnos(){
    this.alumnoService.ListarAlumnos().subscribe(dato => {
      this.alumno = dato;
    });
  }

}
