package com.ltlg.erplab.model;

import java.util.List;

public class ProductoXReserva {

	private Reserva reserva;
	private Inventario inventario;

	public ProductoXReserva() {
		super();
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public List<String> validate() {
		// TODO Auto-generated method stub
		return null;
	}

}
