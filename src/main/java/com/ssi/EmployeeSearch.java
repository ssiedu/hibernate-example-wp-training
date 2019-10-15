package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeSearch {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory=DataUtility.getSessionFactory();
		Session session=sessionFactory.openSession();
		Employee emp=session.get(Employee.class, 1);
		
		System.out.println(emp.getCode());
		System.out.println(emp.getName());
		System.out.println(emp.getLaptop());

		session.close();
	}

}
