package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab1A {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
		Customer cust=new Customer("Sri","Sri@jlc",1234,"Blore",25000.0);
		session.save(cust);
		tx.commit();
		session.close();
		System.out.println("Record inserted");
	}catch(Exception e)
	{
		e.printStackTrace();
		if(tx!=null)tx.rollback();
	}
}
}
