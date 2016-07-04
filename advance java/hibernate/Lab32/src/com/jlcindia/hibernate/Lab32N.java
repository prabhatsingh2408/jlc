package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab32N {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // M) Display All Customers by city with Pagination
	    
	    String hql="from Customer cust where cust.city=?";
	    Query query=session.createQuery(hql);
	    query.setString(0,"Blore");
	    query.setFirstResult(2);
	    query.setMaxResults(4);
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