package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LaptopSearch {

	public static void main(String[] args) {
		SessionFactory sessionFactory=DataUtility.getSessionFactory();
		Session session=sessionFactory.openSession();

		Laptop laptop=session.get(Laptop.class,1001);
		
		System.out.println(laptop.getLaptopId());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getEmployee());
		//System.out.println(laptop.getEmployee().getCode());
		//System.out.println(laptop.getEmployee().getName());
		session.close();
		
	}

}
