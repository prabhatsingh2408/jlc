package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab10C {
public static void main(String[] args) {
	Transaction tx=null;
	try
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
	   	tx=session.beginTransaction();
		
		OldStudent ost=new OldStudent
				("Sona","Berlin","Active",0.0,"BMW","sona@bmw","125.00L");
		
		ost.setSid(1);
		
		session.save(ost);
		
	    tx.commit();
	     
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		tx.rollback();
		}
}
}