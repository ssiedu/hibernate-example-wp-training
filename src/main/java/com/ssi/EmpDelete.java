package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDelete {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		//Emp emp=new Emp(); emp.setEno(115);
		
		//session.delete(emp);
		
		transaction.commit();
		
		
		System.out.println("DATA MODIFIED");

	}

}
