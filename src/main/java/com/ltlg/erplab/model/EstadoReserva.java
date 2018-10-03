package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstadoReserva {

	@Id
	private int idEstadoReserva;
	private String descripcion;

	public EstadoReserva() {
		super();
	}

	public EstadoReserva(int idEstadoReserva2, String descripcion2) {
		this.idEstadoReserva = idEstadoReserva2;
		this.descripcion = descripcion2;
	}

	public int getIdEstadoReserva() {
		return idEstadoReserva;
	}

	public void setIdEstadoReserva(int idEstadoReserva) {
		this.idEstadoReserva = idEstadoReserva;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
