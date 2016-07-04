package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab2B {
public static void main(String[] args) {
	Transaction tx=null;
	try
	{
		//1. Create Session Factory
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		//2. open session Factory
		Session session = sf.openSession();
		
		//3. Begin Transaction
		tx=session.beginTransaction();
		
		//4. Do your Operation
		Customer cust=(Customer)session.load(Customer.class, 5);
		System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getPhone()+"\t"+cust.getCity()+"\t"+cust.getBal());
		
		//5. Commit Transaction
	    tx.commit();
	    
	    //6. Close Session
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		
		//7. Roll Back
		if(tx!=null)
			tx.rollback();
	}
}
}
