package com.zamora.usuario.service;

import java.util.Optional;

import com.zamora.usuario.model.entity.Alumno;

public interface AlumnoService {
	public Iterable<Alumno> findAll();
	public Optional<Alumno> findById(Long id);
	public Alumno save(Alumno alumno);
	public void deleteByid (Long id);
}
