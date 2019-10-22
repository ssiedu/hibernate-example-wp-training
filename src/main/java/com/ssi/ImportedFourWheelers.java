package com.ssi;

import javax.persistence.Entity;

@Entity
public class ImportedFourWheelers extends FourWheelers {
	private int duty;

	public int getDuty() {
		return duty;
	}

	public void setDuty(int duty) {
		this.duty = duty;
	}
	
}
