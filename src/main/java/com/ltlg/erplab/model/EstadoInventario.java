package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstadoInventario {

	@Id
	private int idEstadoInventario;
	private String descripcion;

	public EstadoInventario() {
		super();
	}

	public EstadoInventario(int idEstadoInventario2, String descripcion2) {
		this.idEstadoInventario = idEstadoInventario2;
		this.descripcion = descripcion2;
	}

	public int getIdEstadoInventario() {
		return idEstadoInventario;
	}

	public void setIdEstadoInventario(int idEstadoInventario) {
		this.idEstadoInventario = idEstadoInventario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
