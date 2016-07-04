package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab33C {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // C) Display All Customers by cardType
	    
	    Criteria ct=session.createCriteria(Customer.class);
        ct.add(Restrictions.eq("cardType","MASTER"));
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