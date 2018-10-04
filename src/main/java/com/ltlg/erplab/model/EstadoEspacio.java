package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstadoEspacio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEstadoEspacio;
	private String descripcion;

	// private Set<Espacio> espacio;

	public EstadoEspacio(int estadoEspacioID, String asd) {
		super();
		this.idEstadoEspacio = estadoEspacioID;
		this.descripcion = asd;
	}

	public EstadoEspacio() {
		super();
	}

	public EstadoEspacio(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public EstadoEspacio(int estadoEspacioID) {
		this.idEstadoEspacio = estadoEspacioID;
	}

	public int getIdEstadoEspacio() {
		return idEstadoEspacio;
	}

	public void setIdEstadoEspacio(int idEstadoEspacio) {
		this.idEstadoEspacio = idEstadoEspacio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//	public Set<Espacio> getEspacio() {
//		return espacio;
//	}
//
//	public void setEspacio(Set<Espacio> espacio) {
//		this.espacio = espacio;
//	}

}
