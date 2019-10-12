package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpInfoEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name name=new Name();
		name.setFname("AAA");
		name.setLname("BBB");
		EmpInfo e=new EmpInfo();
		e.setName(name);
		e.setAddress("Palasia");
		e.setCity("Indore");
		Configuration config=new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
	
		Transaction transaction=session.beginTransaction();
		session.save(e);
		transaction.commit();
		session.close();
		System.out.println("DATA STORED");
	}

}
