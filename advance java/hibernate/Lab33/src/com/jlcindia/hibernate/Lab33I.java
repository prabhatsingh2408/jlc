package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab33I {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // I) Display All Customers by balance range and city
	    
	    Criteria ct=session.createCriteria(Customer.class);
        Criterion balance=Restrictions.between("cardBal", 22000.0,41000.0);
        Criterion city=Restrictions.eq("city", "Delhi");
        ct.add(Restrictions.and(balance,city));
	    List<Customer>list=ct.list();
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