package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab32H {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // H) Display All Customers by balance range
	    
	    String hql="from Customer cust where cust.cardBal between ? and ?";
	    Query query=session.createQuery(hql);
	    query.setDouble(0,22000.0);
	    query.setDouble(1,43000.0);
	    List<Customer>list=query.list();
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