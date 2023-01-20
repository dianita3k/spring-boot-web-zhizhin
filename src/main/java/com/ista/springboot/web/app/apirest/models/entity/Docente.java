package com.ista.springboot.web.app.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name ="docente")
public class Docente implements Serializable {
	private static final long serialVersionUID = -9069060843698080433L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id_docente;


@Column(length=50)
private String nombre;

private String apellido;

private String celular;

@Column(nullable=false,length=50,unique=true)
private String email;


@OneToMany(mappedBy = "docente")
private List<Asignatura>asignatura;




public Long getId_docente() {
	return id_docente;
}

public void setId_docente(Long id_docente) {
	this.id_docente = id_docente;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getCelular() {
	return celular;
}

public void setCelular(String celular) {
	this.celular = celular;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}
