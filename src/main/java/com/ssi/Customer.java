package com.ssi;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Customer {
	@EmbeddedId
	private Name name;
	@AttributeOverrides({@AttributeOverride(name="fname",column=@Column(name="fatherFName")), @AttributeOverride(name="lname",column=@Column(name="fatherLName"))})
	private Name fatherName;
	private String email;
	private String mobile;
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Customer(Name name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", fatherName=" + fatherName + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}
	
	
}
