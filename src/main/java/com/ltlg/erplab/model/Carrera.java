package com.ltlg.erplab.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Carrera {

	@Id
	private int id;
	private String descripcion;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "materiaXcarrera", joinColumns = @JoinColumn(name = "carrera_idcarrera", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "materia_idmateria", referencedColumnName = "id"))
	private Set<Materia> materias = new HashSet<Materia>(0);

	public Carrera() {
		super();
	}

	public Carrera(int id, String descripcion) {
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

	public Set<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}

}