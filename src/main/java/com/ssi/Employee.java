package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity

public class Employee {
	@Id
	private int code;
	private String name;

	//@JoinTable(name="EMPLOYEE_LAPTOP", joinColumns = @JoinColumn(name="EMPLOYEE_ID"),inverseJoinColumns = @JoinColumn(name="LAPTOP_ID"))
	//@JoinColumn(name="lcode")
	//@OneToOne(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
	@OneToOne//(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	@OneToMany(mappedBy="emp")
	private List<Vehicle> vehicles=new ArrayList<>();
	
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
		return "Employee [code=" + code + ", name=" + name + "]";
	}
	public Employee(int code, String name, Laptop laptop) {
		super();
		this.code = code;
		this.name = name;
		this.laptop = laptop;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public Employee(int code) {
		super();
		this.code = code;
	}
	
	
}
