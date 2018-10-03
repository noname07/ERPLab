package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Componente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idComponente;
	private String descripcion;
	private boolean activo;

	public Componente() {
		super();
	}

	public Componente(int idComponente, String descripcion, boolean activo, boolean esHerramienta) {
		this.idComponente = idComponente;
		this.descripcion = descripcion;
		this.activo = activo;

	}

	public int getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(int idComponente) {
		this.idComponente = idComponente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
