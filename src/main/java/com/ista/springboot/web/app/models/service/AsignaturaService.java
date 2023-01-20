package com.ista.springboot.web.app.models.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ista.springboot.web.app.apirest.models.entity.Asignatura;


public interface AsignaturaService {
	
	public Iterable<Asignatura>findAll();
	
	public Page<Asignatura> findAll(Pageable pageable);
	
	public Optional<Asignatura> findById(Long id);
	
	public Asignatura save(Asignatura asignatura);
	
	public void deleteById(Long id);

}
