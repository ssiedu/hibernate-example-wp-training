package com.ssi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLOne {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=DataUtility.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		String hql="update Emp set sal=sal+:amt where empno=:code";
		Query query=session.createQuery(hql);
		query.setParameter("amt", 8000);
		query.setParameter("code", 1002);
		
		Transaction tr=session.beginTransaction();
		int n=query.executeUpdate();
		System.out.println(n+" modified");
		tr.commit();
	/*	
		String hql="from Emp where sal>=55000";

		Query query=session.createQuery(hql);
		List<Emp> employees=query.list();
		for(Emp employee:employees) {
			System.out.println(employee);
		}*/
		session.close();
	}

}
