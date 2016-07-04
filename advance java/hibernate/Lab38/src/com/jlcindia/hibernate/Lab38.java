package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab38 {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	 Contact c1=new Contact("Prabhat","Singh","prabhat@gmail.com",98489,"1-1-2005","Active");   
	 Contact c2=new Contact("Trisha","Singh","trisha@gmail.com",984949,"28-9-2015","Active");
	 
	 session.save(c1);
	 session.save(c2);
	 
		tx.commit();
		session.close();
	}catch(Exception e)
	{
		if(tx!=null)
			tx.rollback();
		e.printStackTrace();
	}
}
}
