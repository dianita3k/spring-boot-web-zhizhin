package com.ista.springboot.web.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	

	@Entity
	@Table (name ="usuarios")
	public class User implements Serializable {
		private static final long serialVersionUID = -9069060843698080433L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(length=50)
	private String Nombre;

	private String clave;

	@Column(nullable=false,length=50,unique=true)
	private String email;

	private Boolean estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}



	}
	


