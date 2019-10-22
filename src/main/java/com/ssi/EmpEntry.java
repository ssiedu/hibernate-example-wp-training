package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {


		Emp e1=new Emp("AAA",50000,"SE", new Address("H111","Indore","MP"));
		Emp e2=new Emp("BBB",55000,"SE", new Address("3534","Bhopal","MP"));
		Emp e3=new Emp("CCC",60000,"SSE", new Address("4535","Mumbai","MH"));
	
		Configuration config=new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
	
		Transaction transaction=session.beginTransaction();
		session.save(e1); session.save(e2); session.save(e3);
		//session.evict(e3);
		//e3.setSal(65000);
		transaction.commit();
		session.close();
		//e2.setSal(58000);
		System.out.println("DATA STORED");
		

	}

}
