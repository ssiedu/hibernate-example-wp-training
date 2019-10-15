package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop(1001,"Dell",50000);
		Laptop l2=new Laptop(1002,"HP",60000);
		Laptop l3=new Laptop(1003,"Sony",70000);

		SessionFactory sf=DataUtility.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3);
		tr.commit();
		session.close();
		System.out.println("LAPTOPS ADDED");
	}

}
