package com.ltlg.erplab.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.Time;

import org.junit.Test;

import com.ltlg.erplab.model.Reserva;

public class ReservaTest {
	
	Reserva r1;
	Reserva r2;
	
	public void instHorariosIguales() {
		r1 = new Reserva();
		r1.setDia(new Date(1-1-2018));
		r1.setFechaDesde(new Time(8,0,0));
		r1.setFechaHasta(new Time(12,00,0));

		r2 = new Reserva();
		r2.setDia(new Date(1-1-2018));
		r2.setFechaDesde(new Time(8,00,0));
		r2.setFechaHasta(new Time(12,00,0));
	}
	
	public void instHrIniAntes() {
		r1 = new Reserva();
		r1.setDia(new Date(1-1-2018));
		r1.setFechaDesde(new Time(7,0,0));
		r1.setFechaHasta(new Time(12,00,0));

		r2 = new Reserva();
		r2.setDia(new Date(1-1-2018));
		r2.setFechaDesde(new Time(8,00,0));
		r2.setFechaHasta(new Time(12,00,0));
	}
	
	public void instHrFinDespues() {
		r1 = new Reserva();
		r1.setDia(new Date(1-1-2018));
		r1.setFechaDesde(new Time(8,0,0));
		r1.setFechaHasta(new Time(12,00,0));

		r2 = new Reserva();
		r2.setDia(new Date(1-1-2018));
		r2.setFechaDesde(new Time(11,00,0));
		r2.setFechaHasta(new Time(13,00,0));
	}
	
	public void instHrIniYFin() {
		r1 = new Reserva();
		r1.setDia(new Date(1-1-2018));
		r1.setFechaDesde(new Time(7,0,0));
		r1.setFechaHasta(new Time(13,00,0));

		r2 = new Reserva();
		r2.setDia(new Date(1-1-2018));
		r2.setFechaDesde(new Time(8,00,0));
		r2.setFechaHasta(new Time(12,00,0));
	}
	
	public void intDiaDistinto() {
		r1 = new Reserva();
		r1.setDia(new Date(2-1-2018));
		r1.setFechaDesde(new Time(8,0,0));
		r1.setFechaHasta(new Time(12,00,0));

		r2 = new Reserva();
		r2.setDia(new Date(1-1-2018));
		r2.setFechaDesde(new Time(8,00,0));
		r2.setFechaHasta(new Time(10,00,0));
	}
	
	public void crearInstHorarioDisponible() {
		r1 = new Reserva();
		r1.setDia(new Date(1-1-2018));
		r1.setFechaDesde(new Time(8,0,0));
		r1.setFechaHasta(new Time(12,00,0));

		r2 = new Reserva();
		r2.setDia(new Date(1-1-2018));
		r2.setFechaDesde(new Time(12,00,0));
		r2.setFechaHasta(new Time(23,00,0));
	}

	@Test
	public void mismoHorario() {
		instHorariosIguales();
		assert(r1.seSolapa(r2));
	}
	
	@Test
	public void hrIniAntes() {
		instHrIniAntes();
		assert(r1.seSolapa(r2));
	}
	
	@Test
	public void hrFinDespues() {
		instHrFinDespues();
		assert(r1.seSolapa(r2));
	}
	
	@Test
	public void hrIniYFinEnHorarioReservado() {
		instHrIniYFin();
		assert(r1.seSolapa(r2));
	}
	
	@Test
	public void diaDistinto() {
		intDiaDistinto();
		assertFalse(r1.seSolapa(r2));
	}
	
	@Test
	public void horaDisponible(){
		crearInstHorarioDisponible();
		assertFalse(r1.seSolapa(r2));
	}
	

}
