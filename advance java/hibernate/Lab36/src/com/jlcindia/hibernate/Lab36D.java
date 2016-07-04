package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.List;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab36D {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
	    
	    // D) Display All Customers by city and status
	    
	    String sql="select {cust.*} from customers cust where cust.city=? and cust.status=?";
	    SQLQuery query=session.createSQLQuery(sql);
	    query.addEntity("cust",Customer.class);
	    query.setString(0,"BLore");
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