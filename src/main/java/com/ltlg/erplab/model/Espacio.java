package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Espacio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String codigo;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private boolean activo;

	public Espacio() {
		super();
	}

	public Espacio(int id, String codigo, String nombre, String descripcion, int cantidad, boolean activo) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}

	public void setId(int idEspacio) {
		this.id= idEspacio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
