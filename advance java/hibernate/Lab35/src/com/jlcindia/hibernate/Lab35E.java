package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab35E {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // E) Display All Customers by Pagination
	    
	    Query query=session.getNamedQuery("AllCustomers");
	    query.setFirstResult(0);
	    query.setMaxResults(9);
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