package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab24 {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
		Customer cust=new Customer("Prabhat","pks@city.com",123456789,"TEXAS",25000.0);
		session.save(cust);
		tx.commit();
	    tx=session.beginTransaction();
		cust.setEmail("pks@citybank");
		session.update(cust);
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
