package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class VehicleEntry {

	public static void main(String[] args) {
		
		
		Vehicle v1=new Vehicle("R111", "SedanCar", "Maruti Brand", new Employee(1));
		Vehicle v2=new Vehicle("R112", "SedanCar", "Ford Brand", new Employee(1));
		Vehicle v3=new Vehicle("R113", "SUV", "Ford Brand", new Employee(2));
		Vehicle v4=new Vehicle("R114", "HB", "BMW Brand", new Employee(2));
		Vehicle v5=new Vehicle("R115", "HB", "BMW Brand", new Employee(3));
		
		SessionFactory sf=DataUtility.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		session.save(v4); session.save(v5);
		
		tr.commit();
		session.close();
		System.out.println("EMPLOYEES ADDED");

	}

}
