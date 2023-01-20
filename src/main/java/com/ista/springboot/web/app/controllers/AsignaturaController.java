package com.ista.springboot.web.app.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.web.app.apirest.models.entity.Asignatura;
import com.ista.springboot.web.app.models.service.AsignaturaService;


@RestController
@RequestMapping("/api/asignatura")

public class AsignaturaController {
	@Autowired
	private AsignaturaService asignaturaService;
	
	
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Asignatura asignatura){
		return ResponseEntity.status(HttpStatus.CREATED).body(asignaturaService.save(asignatura));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id") Long asignaturaId){
		Optional<Asignatura> oasiganatura = asignaturaService.findById(asignaturaId);
		if(!oasiganatura.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oasiganatura);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Asignatura asignaturaDetails, @PathVariable(value="id") Long asignaturaId){
		Optional<Asignatura> asignatura=asignaturaService.findById(asignaturaId);
		
		if(!asignatura.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		asignatura.get().setNombre(asignaturaDetails.getNombre());
		asignatura.get().setCarrera(asignaturaDetails.getCarrera());
		asignatura.get().setHora_ini(asignaturaDetails.getHora_ini());
		asignatura.get().setHora_fin(asignaturaDetails.getHora_fin());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(asignaturaService.save(asignatura.get()));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete (@PathVariable(value="id")Long asignaturaId){
		if(!asignaturaService.findById(asignaturaId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		asignaturaService.deleteById(asignaturaId);
		return ResponseEntity.ok().build();
	}
	
@GetMapping
	
	public List<Asignatura> readAll(){
		List<Asignatura> asig = StreamSupport
				.stream(asignaturaService.findAll().spliterator(),false)
				.collect(Collectors.toList());
		return asig;
	}



}
