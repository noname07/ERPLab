package com.ltlg.erplab.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Materia {

	@Id
	private int id;
	private String descripcion;

	public Materia() {
		super();
	}

	public Materia(int id, String descripcion) {
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

	public List<String> validate() {
		// TODO Auto-generated method stub
		return null;
	}

}
