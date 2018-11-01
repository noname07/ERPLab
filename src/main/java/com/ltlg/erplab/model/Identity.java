package com.ltlg.erplab.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Identity {

	@Id
	private String id;
	
	public Identity() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String value) {
		this.id = value;
	}
	
}
