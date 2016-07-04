package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab6B {
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
		Student st=(Student)session.load(Student.class, 3);
		System.out.println(st);
		
		//5. Commit Transaction
	    tx.commit();
	    
	    //6. Close Session
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		tx.rollback();
		}
}
}