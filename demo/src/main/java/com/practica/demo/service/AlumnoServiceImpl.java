package com.practica.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practica.demo.model.Alumno;
import com.practica.demo.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public ArrayList<Alumno> ListarAlummnos() {
		// TODO Auto-generated method stub
		return (ArrayList<Alumno>)alumnoRepository.findAll();
	}

	@Override
	public Optional<Alumno> AlummnoById(long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}

	@Override
	public Alumno GuardarAlummno(Alumno usuario) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(usuario);
	}

	@Override
	public boolean EliminarAlummnoById(long id) {
		try {
			Optional<Alumno>alummno=AlummnoById(id);
			alumnoRepository.delete(alummno.get());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
