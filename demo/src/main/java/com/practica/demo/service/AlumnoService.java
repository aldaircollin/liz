package com.practica.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.practica.demo.model.Alumno;

public interface AlumnoService {
	ArrayList<Alumno>ListarAlummnos();
	Optional<Alumno>AlummnoById(long id);
	Alumno GuardarAlummno(Alumno usuario);
	boolean EliminarAlummnoById(long id);
}
