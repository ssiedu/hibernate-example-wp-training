package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchCustomer {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Name name=new Name();
		name.setFname("xx");
		name.setLname("yy");
		Customer customer=session.get(Customer.class, name);
		System.out.println(customer);
		session.close();
		

	}

}
