package com.ssi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate

public class Emp {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	//@GeneratedValue(strategy=GenerationType.TABLE,generator="cust_gen_table" )
	//@TableGenerator(name="cust_gen_table",allocationSize=1, table="custcodetable",initialValue=501)
	
	//@SequenceGenerator(name="empcode_generator",sequenceName="ecode_gen",allocationSize=1, initialValue=1001)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="empcode_generator" )
	
	private int empno;
	private String ename;
	private int sal;
	private String desg;
	private Address address;
	
	
	
	public Emp(String ename, int sal, String desg, Address address) {
		super();
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
		this.address = address;
	}
	public Emp(int empno, String ename, int sal, String desg, Address address) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp() {
		super();
	}
	
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", desg=" + desg + ", address=" + address
				+ "]";
	}
	
	
}
