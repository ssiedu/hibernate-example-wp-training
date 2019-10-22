package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmpSearch {

	public static void main(String[] args) {
		SessionFactory sessionFactory=DataUtility.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Emp emp=session.get(Emp.class, 1);
		System.out.println(emp);
		emp.setSal(53000);
		emp.setEname("XYZ");
		tr.commit();
		session.close();	
		System.out.println("OPERATION PERFORMED");
	}

}
