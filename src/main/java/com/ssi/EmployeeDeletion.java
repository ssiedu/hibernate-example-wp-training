package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDeletion {

	public static void main(String[] args) {

		SessionFactory sf=DataUtility.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e=new Employee(); e.setCode(3);
		session.delete(e);
		//session.delete(new Laptop(1002));
		tr.commit();
		session.close();
		System.out.println("EMPLOYEES ADDED");
	}

}
