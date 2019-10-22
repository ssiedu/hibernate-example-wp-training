package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	private String regno;
	private String vtype;
	private String vdesc;

	@ManyToOne
	private Employee emp;
	
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public String getVdesc() {
		return vdesc;
	}
	public void setVdesc(String vdesc) {
		this.vdesc = vdesc;
	}
	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", vtype=" + vtype + ", vdesc=" + vdesc + "]";
	}
	public Vehicle(String regno, String vtype, String vdesc) {
		super();
		this.regno = regno;
		this.vtype = vtype;
		this.vdesc = vdesc;
	}
	public Vehicle(String regno) {
		super();
		this.regno = regno;
	}
	public Vehicle() {
		super();
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Vehicle(String regno, String vtype, String vdesc, Employee emp) {
		super();
		this.regno = regno;
		this.vtype = vtype;
		this.vdesc = vdesc;
		this.emp = emp;
	}
	
}
