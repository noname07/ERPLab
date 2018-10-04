package com.ltlg.erplab.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCarrera;
	private String descripcion;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "materiaxcarrera", joinColumns = @JoinColumn(name = "carrera_idcarrera", referencedColumnName = "idCarrera"), inverseJoinColumns = @JoinColumn(name = "materia_idmateria", referencedColumnName = "idMateria"))
	private Set<Materia> materias = new HashSet<Materia>(0);

	public Carrera() {
		super();
	}

	public Carrera(int id, String descripcion) {
		super();
		this.idCarrera = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return idCarrera;
	}

	public void setId(int id) {
		this.idCarrera = id;
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