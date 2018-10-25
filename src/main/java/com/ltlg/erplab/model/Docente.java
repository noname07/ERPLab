package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Docente {
	@Id
	private int idDocente;
	private String nombre;
	private String apellido;
	private String contrasenia;
	private String correo;
	
	public Docente() {
		super();
	}
	
	public Docente(int idDocente, String nombre, String apellido, String contrasenia,String correo) {
		this.idDocente = idDocente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasenia = contrasenia;
		this.correo = correo;
	}
	
	
}
