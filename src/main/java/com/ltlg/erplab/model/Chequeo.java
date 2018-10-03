package com.ltlg.erplab.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chequeo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idChequeo;
	private String descripcion;

	public Chequeo() {
		super();
	}

	public Chequeo(int idchequeo, String descripcion) {
		this.idChequeo = idchequeo;
		this.descripcion = descripcion;
	}

	public int getIdChequeo() {
		return idChequeo;
	}

	public void setIdChequeo(int idChequeo) {
		this.idChequeo = idChequeo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<String> validate() {
		return new ArrayList<String>();
	}

}
