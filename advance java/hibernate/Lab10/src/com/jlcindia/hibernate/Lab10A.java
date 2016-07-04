package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab10A {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
		
	    Student stu=new Student("PrabhatSingh","Blore","Active",1000.0);
	    
	    stu.setSid(1);
	    
	    session.save(stu);
	    
	    tx.commit();
		
	    session.close();
		}catch(Exception e)
		{
		e.printStackTrace();
		tx.rollback();
	    }
      }
    }