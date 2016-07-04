package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab36C {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // C) Display All Customers by email
	    
	    String sql="select {cust.*} from customers cust where cust.email=?";
	    SQLQuery query=session.createSQLQuery(sql);
	    query.addEntity("cust",Customer.class);
	    query.setString(0,"tt@gmail.com");
	    Customer cust=(Customer)query.uniqueResult();
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
