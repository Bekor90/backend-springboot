package com.login.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventos")
public class Eventos implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String cedula;
	private String nit;	
	private String comodin;
	private Timestamp fecha_hora;
	private int est_event_usuario;
	private int est_event_empresa;
	private String nombre_evento;
	private String nombre_comodin;
	private Timestamp tiempo_estimado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getComodin() {
		return comodin;
	}
	public void setComodin(String comodin) {
		this.comodin = comodin;
	}
	public Timestamp getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(Timestamp fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public int getEst_event_usuario() {
		return est_event_usuario;
	}
	public void setEst_event_usuario(int est_event_usuario) {
		this.est_event_usuario = est_event_usuario;
	}
	public int getEst_event_empresa() {
		return est_event_empresa;
	}
	public void setEst_event_empresa(int est_event_empresa) {
		this.est_event_empresa = est_event_empresa;
	}
	public String getNombre_evento() {
		return nombre_evento;
	}
	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}
	public String getNombre_comodin() {
		return nombre_comodin;
	}
	public void setNombre_comodin(String nombre_comodin) {
		this.nombre_comodin = nombre_comodin;
	}
	public Timestamp getTiempo_estimado() {
		return tiempo_estimado;
	}
	public void setTiempo_estimado(Timestamp tiempo_estimado) {
		this.tiempo_estimado = tiempo_estimado;
	}
		
	private static final long serialVersionUID = 1L;
}
