package com.ltlg.erplab.model;

public class ProcedimientoMantenimiento {

	private int idProcedimientoMantenimiento;
	private String descripcion;
	private Producto producto;

	public ProcedimientoMantenimiento() {
		super();
	}

	public ProcedimientoMantenimiento(int idProcedimientoMantenimiento2, String descripcion2, int idproducto) {
		this.idProcedimientoMantenimiento = idProcedimientoMantenimiento2;
		this.descripcion = descripcion2;
	}

	public int getIdProcedimientoMantenimiento() {
		return idProcedimientoMantenimiento;
	}

	public void setIdProcedimientoMantenimiento(int idProcedimientoMantenimiento) {
		this.idProcedimientoMantenimiento = idProcedimientoMantenimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
