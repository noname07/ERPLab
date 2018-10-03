package com.ltlg.erplab.model;

import java.util.List;

public class DetalleInformeMantenimiento {

	private int idDetalleInformeMantenimiento;
	private boolean valor;
	private InformeMantenimiento informeMantenimiento;
	private Chequeo chequeo;

	public DetalleInformeMantenimiento() {
		super();
	}

	public DetalleInformeMantenimiento(boolean valor2, int idinformeMantenimiento, int chequeoid) {
		this.valor = valor2;

	}

	public int getIdDetalleInformeMantenimiento() {
		return idDetalleInformeMantenimiento;
	}

	public void setIdDetalleInformeMantenimiento(int idDetalleInformeMantenimiento) {
		this.idDetalleInformeMantenimiento = idDetalleInformeMantenimiento;
	}

	public boolean isValor() {
		return valor;
	}

	public void setValor(boolean valor) {
		this.valor = valor;
	}

	public InformeMantenimiento getInformeMantenimiento() {
		return informeMantenimiento;
	}

	public void setInformeMantenimiento(InformeMantenimiento informeMantenimiento) {
		this.informeMantenimiento = informeMantenimiento;
	}

	public Chequeo getChequeo() {
		return chequeo;
	}

	public void setChequeo(Chequeo chequeo) {
		this.chequeo = chequeo;
	}

	public List<String> validate() {
		// TODO Auto-generated method stub
		return null;
	}

}
