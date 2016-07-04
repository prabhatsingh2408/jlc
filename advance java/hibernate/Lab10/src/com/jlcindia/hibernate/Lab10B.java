package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab10B {
public static void main(String[] args) {
	Transaction tx=null;
	try
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
	   	tx=session.beginTransaction();
		
		CurrentStudent cst=new CurrentStudent
				("Rama","Blore","Active",17000,500,"7:00-9:00","BTM");
		
		cst.setSid(1);
		
		session.save(cst);
		
	    tx.commit();
	    
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		tx.rollback();
		}
}
}