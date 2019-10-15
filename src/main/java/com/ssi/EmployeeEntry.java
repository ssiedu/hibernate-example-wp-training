package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeEntry {

	public static void main(String[] args) {
	
		Employee e1=new Employee(1,"AAA",new Laptop(1001));
		Employee e2=new Employee(2,"BBB",new Laptop(1002));
		Employee e3=new Employee(3,"CCC",new Laptop(1003));

		SessionFactory sf=DataUtility.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2); session.save(e3);
		tr.commit();
		session.close();
		System.out.println("EMPLOYEES ADDED");
	}

}
