package com.login.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comodin")
public class Comodin implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String nombre;
	private Timestamp horaini;
	private Timestamp horafin;
	private int estado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Timestamp getHoraini() {
		return horaini;
	}
	public void setHoraini(Timestamp horaini) {
		this.horaini = horaini;
	}
	public Timestamp getHorafin() {
		return horafin;
	}
	public void setHorafin(Timestamp horafin) {
		this.horafin = horafin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}	
	
	private static final long serialVersionUID = 1L;
}
