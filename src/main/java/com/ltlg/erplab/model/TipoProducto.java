package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoProducto {

	@Id
	private int idTipo;
	private String descripcion;

	public TipoProducto() {
		super();
	}

	public TipoProducto(int idTipo, String descripcion) {
		this.idTipo = idTipo;
		this.descripcion = descripcion;
	}

	public int getIdTipoProducto() {
		return this.idTipo;
	}

	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipo = idTipoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
