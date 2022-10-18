import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Alumno } from '../alumno';
import { AlumnoService } from '../alumno.service';
import swal from 'sweetalert2';
@Component({
  selector: 'app-registrar',
  templateUrl: './registrar.component.html',
  styleUrls: ['./registrar.component.css']
})
export class RegistrarComponent implements OnInit {

  titulo: string="Registrar Nuevo Proveedor";
  alumno : Alumno = new Alumno();
  constructor(private alumnoService:AlumnoService,private router:Router) { }

  ngOnInit(): void {
  }
  public crearAlumno(): void{
    this.alumnoService.registrarAlumnos(this.alumno).subscribe(
      //response => this.router.navigate(['/producto']) anterior
      producto => {
        this.router.navigate(['/alumno'])
       swal.fire("Enhorabuena",'Se ha registrado de manera satisfactoria',"success")
      }
    )
  }
}
