package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ubicacion {

	@Id
	private int id;
	private String descripcion;

	public Ubicacion() {
		super();
	}

	public Ubicacion(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
