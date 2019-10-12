package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
	
		Transaction transaction=session.beginTransaction();
	
		Customer customer1=new Customer(new Name("aa","bb"), "abc@gmail.com","9099033454");
		Customer customer2=new Customer(new Name("xx","yy"), "xyz@gmail.com","7080908585");
		
		session.save(customer1);session.save(customer2);
		transaction.commit();
		session.close();
		System.out.println("DATA STORED");

	}

}
