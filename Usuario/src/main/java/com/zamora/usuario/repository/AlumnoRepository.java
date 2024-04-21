package com.zamora.usuario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zamora.usuario.model.entity.Alumno;

@Repository 
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
