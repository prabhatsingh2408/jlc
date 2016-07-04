package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab32A {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // A) Display All Customers
	    
	    String hql="from Customer cust";
	    Query query=session.createQuery(hql);
	    List<Customer> list=query.list();
	    for(Customer cust:list)
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
