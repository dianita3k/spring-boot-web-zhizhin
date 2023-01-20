package com.ista.springboot.web.app.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.springboot.web.app.apirest.models.entity.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long>{

}
