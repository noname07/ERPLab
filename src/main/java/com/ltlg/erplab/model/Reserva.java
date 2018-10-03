package com.ltlg.erplab.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Reserva {

	public int idReserva;
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date dia;
	public String actividad;
	@JsonFormat(pattern = "HH:mm:ss")
	public Time fechaDesde;
	@JsonFormat(pattern = "HH:mm:ss")
	public Time fechaHasta;
	public User usuarioGenero;
	public Espacio espacioReservado;
	public EstadoReserva estadoReserva;
	public Materia materia;
	public TipoActividad tipoActividad;
	public CantAlumno cantAlumno;
	public Set<Producto> productos = new HashSet<Producto>(0);

	public Reserva() {
		super();
	}

	public Reserva(int idReserva2, int idUsuario, int idEspacio, int idEstadoReserva) {
		this.idReserva = idReserva2;

	}

	public Reserva(int idReserva, Date dia, String actividad, Time fechaDesde, Time fechaHasta, User usuarioGenero,
			Espacio espacioReservado, EstadoReserva estadoReserva, Materia materia, TipoActividad tipoActividad,
			CantAlumno cantAlumno) {
		super();
		this.idReserva = idReserva;
		this.dia = dia;
		this.actividad = actividad;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
		this.usuarioGenero = usuarioGenero;
		this.espacioReservado = espacioReservado;
		this.estadoReserva = estadoReserva;
		this.materia = materia;
		this.tipoActividad = tipoActividad;
		this.cantAlumno = cantAlumno;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public Time getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Time fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Time getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(Time fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public User getUsuarioGenero() {
		return usuarioGenero;
	}

	public void setUsuarioGenero(User usuarioGenero) {
		this.usuarioGenero = usuarioGenero;
	}

	public Espacio getEspacioReservado() {
		return espacioReservado;
	}

	public void setEspacioReservado(Espacio espacioReservado) {
		this.espacioReservado = espacioReservado;
	}

	public EstadoReserva getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(EstadoReserva estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public TipoActividad getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(TipoActividad tipoActividad) {
		this.tipoActividad = tipoActividad;
	}

	public CantAlumno getCantAlumno() {
		return cantAlumno;
	}

	public void setCantAlumno(CantAlumno cantAlumno) {
		this.cantAlumno = cantAlumno;
	}

	public List<String> validate() {
		List<String> errores = new ArrayList<String>();

		if (this.getActividad().isEmpty()) {
			errores.add("El campo actividad es obligatorio");
		}

		if (this.getFechaDesde().after(this.getFechaHasta())) {
			errores.add("La hora 'DESDE' debe ser inferior a la hora 'HASTA'");
		}

		return errores;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}
