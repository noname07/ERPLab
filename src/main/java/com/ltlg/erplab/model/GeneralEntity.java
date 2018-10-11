package com.ltlg.erplab.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class GeneralEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCarrera; 
	public GeneralEntity() {
		super();
	}

	public int getId() {
		return idCarrera;
	}

	public void setId(int id) {
		this.idCarrera = id;
	}
}

