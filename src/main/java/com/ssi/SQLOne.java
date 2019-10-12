package com.ssi;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SQLOne {

	public static void main(String[] args) {
		SessionFactory sessionFactory=DataUtility.getSessionFactory();
		Session session=sessionFactory.openSession();
		String sql="select * from emp";
		
		SQLQuery query=session.createSQLQuery(sql);
		query.addEntity(Emp.class);
		
		List<Emp> emps=query.list();
		
		for(Emp emp:emps) {
			System.out.println(emp);
		}
		
		session.close();
		
	}

}
