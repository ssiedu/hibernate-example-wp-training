package com.ssi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="W4")
public class FourWheelers extends Vehicles {
	private String wheelType;

	public String getWheelType() {
		return wheelType;
	}

	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}
	
}
