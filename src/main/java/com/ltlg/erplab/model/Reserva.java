package com.ltlg.erplab.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReserva;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dia;
	private String actividad;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time hrDesde;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time hrHasta;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private User usuarioGenero;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Espacio espacioReservado;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private EstadoReserva estadoReserva;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Materia materia;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private TipoActividad tipoActividad;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private CantAlumno cantAlumno;

	public Reserva() {
		super();
	}

	public Reserva(int idReserva, int idUsuario, int idEspacio, int idEstadoReserva) {
		this.idReserva = idReserva;
	}

	public Reserva(int idReserva, Date dia, String actividad, Time fechaDesde, Time fechaHasta, User usuarioGenero,
			Espacio espacioReservado, EstadoReserva estadoReserva, Materia materia, TipoActividad tipoActividad,
			CantAlumno cantAlumno) {
		super();
		this.idReserva = idReserva;
		this.dia = dia;
		this.actividad = actividad;
		this.hrDesde = fechaDesde;
		this.hrHasta = fechaHasta;
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
		return hrDesde;
	}

	public void setFechaDesde(Time fechaDesde) {
		this.hrDesde = fechaDesde;
	}

	public Time getFechaHasta() {
		return hrHasta;
	}

	public void setFechaHasta(Time fechaHasta) {
		this.hrHasta = fechaHasta;
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

	public boolean seSolapa(Reserva reserva) {
		
		if(reserva.dia.equals(dia)) {
			// La reserva inicia antes y finaliza despues que la reserva actual.
			if(reserva.hrDesde.before(hrDesde) && reserva.hrHasta.after(hrHasta))
				return true;
			
			// Hora de Inicio entre un horario reservado.
			else if(reserva.hrDesde.after(hrDesde) && reserva.hrDesde.before(hrHasta))
				return true;
			
			// Hora de Fin entre un horario reservado.
			else if(reserva.hrDesde.before(hrDesde) && reserva.hrHasta.after(hrDesde))
				return true;
			
			// Alguno de los horarios de inicio o fin se solapan con alguna reserva.
			else if(reserva.hrDesde.equals(hrDesde) || reserva.hrHasta.equals(hrHasta))
				return true;
		}		
		return false;
	}
}
