package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab10E {
public static void main(String[] args) {
	Transaction tx=null;
	try
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
	   	tx=session.beginTransaction();
		
		WeekendStudent west=new WeekendStudent
				("Sonakshi","Chicago","Active",18000.0,0.0,
						"12:00-2:00","BTM","Tesla","sonakshi@tesla",220.00);
		
		west.setSid(1);
		
		session.save(west);
		
	    tx.commit();
	    
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		tx.rollback();
		}
}
}