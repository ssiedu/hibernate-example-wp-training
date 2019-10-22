package com.ssi;

import org.hibernate.Session;

public class SearchVehicles {

	public static void main(String[] args) {
		
		Session session=DataUtility.getSessionFactory().openSession();
		Vehicles vehicle=session.get(Vehicles.class, "R113");
		System.out.println(vehicle.getRegno());
		System.out.println(vehicle.getVtype());
		System.out.println(vehicle.getClass().getName());
		

	}

}
