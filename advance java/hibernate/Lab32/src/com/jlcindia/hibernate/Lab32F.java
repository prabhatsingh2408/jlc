package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab32F {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // F) Display All Customers by city and status
	    
	    String hql="from Customer cust where cust.city=? and cust.status=?";
	    Query query=session.createQuery(hql);
	    query.setString(0,"Blore");
	    query.setString(1,"ACTIVE");
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