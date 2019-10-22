package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddVehicles {

	public static void main(String[] args) {
		
		Vehicles v1=new Vehicles();	
		v1.setRegno("R111"); v1.setVtype("Unknown");
		
		TwoWheelers v2=new TwoWheelers();
		v2.setRegno("R112"); v2.setVtype("Bike"); v2.setHandleType("Simple");
		
		FourWheelers v3=new FourWheelers();
		v3.setRegno("R113"); v3.setVtype("Car"); v3.setWheelType("Power");
		
		ImportedFourWheelers v4=new ImportedFourWheelers();
		v4.setRegno("R114");
		v4.setVtype("ImportedCar");
		v4.setDuty(125);
		v4.setWheelType("HydPowWheel");
		Session session=DataUtility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		session.save(v4);
		
		tr.commit();
		session.close();
		
	}

}
