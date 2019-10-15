package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int laptopId;
	private String brand;
	private int price;
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
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
