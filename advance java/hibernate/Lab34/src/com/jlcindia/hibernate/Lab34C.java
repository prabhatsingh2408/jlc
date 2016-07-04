package com.jlcindia.hibernate;
import org.hibernate.*;

import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab34C {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // C) Display All Customers by email
	    
	    Query query=session.getNamedQuery("CustomersByEmail");

	    query.setString(0,"prabhat@gmail.com");
	    Customer cust=(Customer)query.uniqueResult();
		System.out.println(cust);
		tx.commit();
		session.close();
	}catch(Exception e)
	{
		e.printStackTrace();
		if(tx!=null)tx.rollback();
	}
}
}
