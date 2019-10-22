package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CascadeTest {

	public static void main(String[] args) {

		Employee e1=new Employee(1,"AAA",new Laptop(1001,"Dell",51000));
		Employee e2=new Employee(2,"BBB",new Laptop(1002, "HP", 61000));
		Employee e3=new Employee(3,"CCC",new Laptop(1003, "Sony",71000));
		
		SessionFactory sf=DataUtility.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//session.save(e1); session.save(e2); session.save(e3);//not for cascade
		//session.persist(e1); session.persist(e2); session.persist(e3);
		session.delete(session.get(Employee.class, 1));
		//session.delete(session.get(Laptop.class, 1003));

		tr.commit();
		session.close();
		System.out.println("EMPLOYEES ADDED");
	}

}
