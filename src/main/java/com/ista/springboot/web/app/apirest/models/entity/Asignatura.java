package com.ista.springboot.web.app.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="asignatura")
public class Asignatura implements Serializable{
	private static final long serialVersionUID = -9069060843698080433L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id_asinatura;


@Column(length=50)
private String nombre;

@Column(length=50)
private String carrera;

private String hora_ini;


private String hora_fin;




public Long getId_asinatura() {
	return id_asinatura;
}




public void setId_asinatura(Long id_asinatura) {
	this.id_asinatura = id_asinatura;
}




public String getNombre() {
	return nombre;
}




public void setNombre(String nombre) {
	this.nombre = nombre;
}




public String getHora_ini() {
	return hora_ini;
}




public void setHora_ini(String hora_ini) {
	this.hora_ini = hora_ini;
}




public String getHora_fin() {
	return hora_fin;
}




public void setHora_fin(String hora_fin) {
	this.hora_fin = hora_fin;
}





public String getCarrera() {
	return carrera;
}




public void setCarrera(String carrera) {
	this.carrera = carrera;
}





@ManyToOne
@JoinColumn(name = "id_docente",referencedColumnName = "id_docente")
private Docente docente;
	



}
