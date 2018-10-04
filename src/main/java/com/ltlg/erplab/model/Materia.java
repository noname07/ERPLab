package com.ltlg.erplab.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMateria;
	private String descripcion;

	public Materia() {
		super();
	}

	public Materia(int idMateria, String descripcion) {
		super();
		this.idMateria = idMateria;
		this.descripcion = descripcion;
	}

	public int getId() {
		return idMateria;
	}

	public void setId(int id) {
		this.idMateria = id;
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
