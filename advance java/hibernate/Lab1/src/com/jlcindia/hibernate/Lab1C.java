package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab1C {
public static void main(String[] args) {
	Transaction tx=null;	
	try
	{
		//Step 1. Create Session
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		//Step 2. Open Session
		Session session = sf.openSession();
		
		//Step 3. Begin Transaction
		tx=session.beginTransaction();
		
		//Step 4. Do your Operation
		Customer cust=(Customer)session.get(Customer.class, 1);
		System.out.println(cust);
		if(cust!=null)
	System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getPhone()+"\t"+cust.getCity()+"\t"+cust.getBal());
	else
		System.out.println("Sorry, Customer not Found");
		
		//Step 5. Commit Transaction
		tx.commit();
		
		//Step 6. Close Session
		session.close();
}catch(Exception e){
	e.printStackTrace();
	
	//Step 7. Roll Back
	if(tx!=null)
		tx.rollback();
}
}
}