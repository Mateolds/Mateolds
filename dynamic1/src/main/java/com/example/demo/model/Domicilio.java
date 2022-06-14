package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="domicilio")
public class Domicilio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_domicilio")
	Long id_domicilio;
	@Column(name="fecha_domicilio")
	private Date fecha_domicilio;
	@ManyToOne
	@JoinColumn(name="fDomicilios")
	Factura domicilio;
	@ManyToOne
	@JoinColumn(name="eDomicilio")
	EstadoDomicilio eDomicilios;
	public Long getId_domicilio() {
		return id_domicilio;
	}
	public void setId_domicilio(Long id_domicilio) {
		this.id_domicilio = id_domicilio;
	}
	public Date getFecha_domicilio() {
		return fecha_domicilio;
	}
	public void setFecha_domicilio(Date fecha_domicilio) {
		this.fecha_domicilio = fecha_domicilio;
	}
	public Factura getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Factura domicilio) {
		this.domicilio = domicilio;
	}
	public EstadoDomicilio geteDomicilios() {
		return eDomicilios;
	}
	public void seteDomicilios(EstadoDomicilio eDomicilios) {
		this.eDomicilios = eDomicilios;
	}
}
