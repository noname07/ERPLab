package com.ltlg.erplab.model;

public class ChequeoXProcedimiento {

	private Chequeo chequeo;
	private ProcedimientoMantenimiento procedimientoMantenimiento;
	private int orden;

	public ChequeoXProcedimiento() {
		super();
	}

	public Chequeo getChequeo() {
		return chequeo;
	}

	public void setChequeo(Chequeo chequeo) {
		this.chequeo = chequeo;
	}

	public ProcedimientoMantenimiento getProcedimientoMantenimiento() {
		return procedimientoMantenimiento;
	}

	public void setProcedimientoMantenimiento(ProcedimientoMantenimiento procedimientoMantenimiento) {
		this.procedimientoMantenimiento = procedimientoMantenimiento;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

}
