package com.login.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicio implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(unique=true, length=150)
	private String nombre;
	private String dias;
	private Double costo;
	private int estado;
	private String tiempo;
	private String nit;
	private Timestamp horaini;
	private Timestamp horafin;
	private String holgura;
	
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
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
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
	public String getHolgura() {
		return holgura;
	}
	public void setHolgura(String holgura) {
		this.holgura = holgura;
	}
	
	private static final long serialVersionUID = 1L;

}
