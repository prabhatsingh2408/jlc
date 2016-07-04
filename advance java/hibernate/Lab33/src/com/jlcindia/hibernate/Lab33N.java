package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab33N {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // M) Display All Customers by city with Pagination
	    
	    Criteria ct=session.createCriteria(Customer.class);
	    ct.add(Restrictions.eq("city","Blore"));
	    ct.setFirstResult(1);
	    ct.setMaxResults(4);
	    List<Customer> list=ct.list();
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