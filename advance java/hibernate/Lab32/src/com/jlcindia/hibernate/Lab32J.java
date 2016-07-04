package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab32J {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // J) Display All Customers by city
	    
	    String hql="from Customer cust where cust.city=:mycity";
	    Query query=session.createQuery(hql);
	    query.setString("mycity","Blore");
	    query.setParameter("mycity","Delhi");
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