package com.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHiber {

	public static void main(String[] args) {

		System.out.println("Project Start !!!");
		Address ad1=new Address(123,"Kolhapur","Maharashtra");
		Address ad2=new Address(456,"Gokak","Karnataka");
		Address ad3=new Address(789,"Mathura","UP");
		Address ad4=new Address(246,"Banglore","Chennai");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tr=session.beginTransaction();
		
		session.save(ad1);
//		session.save(ad2);
//		session.save(ad3);
//		session.save(ad4);
		
//		int i1=(Integer)session.save(ad1);
		
//		session.persist(ad1);
//		session.persist(ad2);
//		session.persist(ad3);
//		session.persist(ad4);
		
//		Integer i2=(Integer)session.save(ad2);
//		Integer i3=(Integer)session.save(ad3);
		
		Address a=(Address)session.get(Address.class, 123);
//		Address a1=(Address)session.load(Address.class, 1234);
		
//		System.out.println(a);
		
		tr.commit();
		
//		System.out.println(ad1);
//		System.out.println(ad2);
//		System.out.println(ad3);
//		System.out.println(ad4);
		
		System.out.println("Project Ended !!!"); 
	}

}
