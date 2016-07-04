package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab10F {
public static void main(String[] args) {
	Transaction tx=null;
	try
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
	   	tx=session.beginTransaction();
		
		Student stu=(Student) session.load(WeekendStudent.class, 1);
		
		System.out.println(stu);		
		
		tx.commit();
	    
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		tx.rollback();
		}
}
}