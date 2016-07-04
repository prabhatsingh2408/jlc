package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab26 {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
		Customer cust=new Customer("Trisha","trisha@gmail",1234,"LONDON",0.0);
		session.save(cust);
		System.out.println("Record inserted");
		tx.commit();
		tx=session.beginTransaction();
		System.out.println("Triying to update name");
		cust.setPhone(12345);
		session.update(cust);
		tx.commit();
		session.close();
		System.out.println("Record inserted");
    	}catch(Exception e)
	   {
    		e.printStackTrace();
		if(tx!=null)
		tx.rollback();
	}
  }
}
