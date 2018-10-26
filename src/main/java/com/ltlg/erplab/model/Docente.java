package com.ltlg.erplab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Docente{
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
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getId() {
		return idDocente;
	}
}
