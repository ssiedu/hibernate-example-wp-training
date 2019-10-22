package com.ssi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int laptopId;
	private String brand;
	private int price;
	
	//@OneToOne(mappedBy="laptop", cascade= {CascadeType.REMOVE, CascadeType.PERSIST})
	@OneToOne(mappedBy="laptop")
	private Employee employee;
	
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Laptop(int laptopId, String brand, int price) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.price = price;
	}
	public Laptop() {
		super();
	}
	
	public Laptop(int laptopId) {
		super();
		this.laptopId = laptopId;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", price=" + price +  "]";
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Laptop(int laptopId, String brand, int price, Employee employee) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.price = price;
		this.employee = employee;
	}
	
	
}
