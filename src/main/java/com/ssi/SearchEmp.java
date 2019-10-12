package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SearchEmp {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		//Emp emp=session.get(Emp.class, 1001);
		Emp emp=session.load(Emp.class, 1001);
		
		System.out.println(emp.getEmpno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getAddress());
		
	/*	Emp emp1=session.get(Emp.class, 1001);
		System.out.println(emp1);*/
		session.close();
		
	}

}
