package com.ltlg.erplab.model;

import java.util.List;

public class Space {

	public Integer id;
	public String nombre;
	public String descripcion;
	public Boolean activo;

	public List<Equipo> equipments;

	public Space(Integer id, String nombre, String descripcion, Boolean activo) {
		this.setId(id);
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setActivo(activo);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public List<Equipo> getEquipos() {
		return equipments;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipments = equipos;
	}
}
