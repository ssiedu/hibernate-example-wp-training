package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class VehicleSearch {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory=DataUtility.getSessionFactory();
		Session session=sessionFactory.openSession();
		Vehicle vehicle=session.get(Vehicle.class, "R111");
		
		System.out.println(vehicle.getRegno());
		System.out.println(vehicle.getVtype());
		System.out.println(vehicle.getVdesc());
		Employee employee=vehicle.getEmp();
		System.out.println(employee);
		session.close();
		
		
	}
}
