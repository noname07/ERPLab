package com.ltlg.erplab.model;

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

}
