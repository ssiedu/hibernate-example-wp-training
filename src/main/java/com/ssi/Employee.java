package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Employee {
	@Id
	private int code;
	private String name;

	@OneToOne
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", laptop=" + laptop + "]";
	}
	public Employee(int code, String name, Laptop laptop) {
		super();
		this.code = code;
		this.name = name;
		this.laptop = laptop;
	}
	
	
	
}
