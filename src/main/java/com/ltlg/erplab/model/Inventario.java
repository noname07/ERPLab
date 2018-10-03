package com.ltlg.erplab.model;

public class Inventario {

	private int idInventario;
	private EstadoInventario estadoInventario;
	private Producto producto;

	public Inventario() {
		super();
	}

	public Inventario(int idInventario2, String patrimonio, int idestadoInventario, int idProducto, int idUbicacion) {
		this.idInventario = idInventario2;
	}

	public int getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}

	public EstadoInventario getEstadoInventario() {
		return estadoInventario;
	}

	public void setEstadoInventario(EstadoInventario estadoInventario) {
		this.estadoInventario = estadoInventario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
