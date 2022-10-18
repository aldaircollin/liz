package com.practica.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.demo.model.Alumno;
import com.practica.demo.service.AlumnoService;

@RestController
@RequestMapping(("alumno"))
@CrossOrigin("http://localhost:4200/")
public class AlumnoController {

	@Autowired
	AlumnoService alumnoService;
	
	@GetMapping("/listar")
	public ArrayList<Alumno>ListarAlumnos(){
		return alumnoService.ListarAlummnos();
	}
	
	@GetMapping("/buscarporid/{id}")
public Optional<Alumno>ListarAlummnoPorId(@PathVariable("id")long id){
		return alumnoService.AlummnoById(id);
	}
	
	@PostMapping("/guardar")
	public Alumno GuardarAlummno(@RequestBody Alumno alumno) {
		return alumnoService.GuardarAlummno(alumno);
}

	@DeleteMapping("/eliminar/{id}")
	public String EliminarAlummnoPorId(@PathVariable("id")long id) {
	if (alumnoService.EliminarAlummnoById(id))
		return "se ha eliminado";
		
	else {
		return "no se ha elimnado";
	}
	
	}
}
