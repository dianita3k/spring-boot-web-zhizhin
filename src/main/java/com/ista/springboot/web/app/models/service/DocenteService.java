package com.ista.springboot.web.app.models.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ista.springboot.web.app.apirest.models.entity.Docente;


public interface DocenteService {

	public Iterable<Docente>findAll();
	
	public Page<Docente> findAll(Pageable pageable);
	
	public Optional<Docente> findById(Long id);
	
	public Docente save(Docente docente);
	
	public void deleteById(Long id);
	
	
	
	
}
