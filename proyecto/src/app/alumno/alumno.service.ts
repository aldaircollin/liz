import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Alumno } from './alumno';

@Injectable({
  providedIn: 'root'
})
export class AlumnoService {

  private baseURL = "http://localhost:8080/alumno";
  constructor(private httpClient : HttpClient) { }
  //este metodo nos sirve para obtener los alumnos
  ListarAlumnos():Observable<Alumno[]>{
    return this.httpClient.get<Alumno[]>(`${this.baseURL+"/listar"}`);
  }

  //este metodo nos sirve para registrar un alumno
  registrarAlumnos(alumno:Alumno) : Observable<Object>{
    return this.httpClient.post(`${this.baseURL+"/guardar"}`,alumno);
  }

}
