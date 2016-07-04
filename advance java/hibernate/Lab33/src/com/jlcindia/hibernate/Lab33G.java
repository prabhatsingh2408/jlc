package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab33G {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // G) Display All Customers by city and status and cardType
	    
	    Criteria ct=session.createCriteria(Customer.class);
	    Criterion city=Restrictions.eq("city","Blore");
	    Criterion status=Restrictions.eq("status","ACTIVE");
	    Criterion ctype=Restrictions.eq("cardType","VISA");
	    ct.add(Restrictions.and(status,city,ctype));
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