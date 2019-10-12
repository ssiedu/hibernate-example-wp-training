package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;



public class QBCOne {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		
		//Criterion crt1=Restrictions.eq("sal", 50000);
		//Criterion crt1=Restrictions.between("sal", 56000, 75000);
		//criteria.add(crt1);
		//Order order=Order.desc("sal");
		//criteria.addOrder(order);

		ProjectionList pList=Projections.projectionList();
		Projection pr1=Projections.property("ename");
		Projection pr2=Projections.property("sal");
		pList.add(pr1);
		pList.add(pr2);
		//criteria.setProjection(pr1);
		criteria.setProjection(pList);
		
		List<Object[]> values=criteria.list();
		
		for(Object ar[]:values) {
			for(Object obj:ar) {
				System.out.println(obj);
			}
			System.out.println("_____________________________");
		}
		
		
		
		
		
	/*	List<String> names=criteria.list();
		for(String name:names) {
			System.out.println(name);
		}*/
		
		
		/*for(Emp emp:emps) {
			System.out.println(emp);
		}*/
		
		session.close();
	}

}
