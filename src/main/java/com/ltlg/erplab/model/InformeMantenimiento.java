package com.ltlg.erplab.model;

import java.sql.Timestamp;

public class InformeMantenimiento {
	
	private int idInformeMantenimiento;
	private Timestamp fecha;
	private String observacion;
	private Producto producto;

	public InformeMantenimiento() {
		super();
	}

	public InformeMantenimiento(int idInformeMantenimiento2, String observa, int idmantenimiento, int idinventario) {
		this.idInformeMantenimiento = idInformeMantenimiento2;
		this.observacion = observa;
	}

	public int getIdInformeMantenimiento() {
		return idInformeMantenimiento;
	}

	public void setIdInformeMantenimiento(int idInformeMantenimiento) {
		this.idInformeMantenimiento = idInformeMantenimiento;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
