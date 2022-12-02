package com.hibernate.singleton;

import javax.transaction.Transaction;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernateSingleton {

	static SessionFactory factory = null;
	
	public static SessionFactory getFactory() {
		if(factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	
	public static void main(String[] args) {

		Library l1 = new Library();
		l1.setBookAuthor("Shivaji Savant");
		l1.setBookName("Mrutyunjaya");
		
		Library l2 = new Library();
		l2.setBookAuthor("Shivaji Savant");
		l2.setBookName("Chhava");
		
		Library l3 = new Library();
		l3.setBookAuthor("Sane Guruji");
		l3.setBookName("Shyamachi aai");
		
		Library l4 = new Library();
		l4.setBookAuthor("Ranjit Desai");
		l4.setBookName("Shriman Yogi");
		
		try(SessionFactory factory= getFactory();
				Session session=factory.openSession();){
			org.hibernate.Transaction tx= session.beginTransaction();
			session.save(l1);
			session.save(l2);
			session.save(l3);
			session.save(l4);
			
			tx.commit();
		}
		catch (Exception e) {	
			System.out.println();
		}
		
	}

}
