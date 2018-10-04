package com.ltlg.erplab.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Espacio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEspacio;
	private String codigo;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private boolean activo;
	@ManyToOne(cascade = CascadeType.ALL)
	private EstadoEspacio estadoEspacio;

	public Espacio() {
		super();
	}

	public Espacio(int idEspacio, String codigo, String nombre, String descripcion, int cantidad, boolean activo,
			EstadoEspacio estadoEspacio) {
		this.idEspacio = idEspacio;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.activo = activo;
		this.estadoEspacio = estadoEspacio;
	}

	public int getIdEspacio() {
		return idEspacio;
	}

	public void setIdEspacio(int idEspacio) {
		this.idEspacio = idEspacio;
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

	public EstadoEspacio getEstadoEspacio() {
		return estadoEspacio;
	}

	public void setEstadoEspacio(EstadoEspacio estadoEspacio) {
		this.estadoEspacio = estadoEspacio;
	}

	public Integer getId() {
		return idEspacio;
	}
}
