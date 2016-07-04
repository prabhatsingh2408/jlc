package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab6A {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
		
	    //1.Adding the Student
	    Student stu=new Student("PrabhatSingh","Blore","Enabled",15000.0);
	    Integer it=(Integer)session.save(stu);
	    System.out.println(it.intValue());
	    
	    //2.Adding the CurrentStudent
	    CurrentStudent cstu=new CurrentStudent("Prabhat","Blore","Enabled",15000.0,00.0,"7.00 A.M","Mathikhere");
	    it=(Integer)session.save(cstu);
	    System.out.println(it.intValue());
	    
	    //3.Adding the OldStudent
	    OldStudent ostu=new OldStudent("Sonakshi","Blore","Enabled",15000.0,"GOOGLE","Sonakshi@gmail.com",27.0);
	    it=(Integer)session.save(ostu);
	    System.out.println(it.intValue());
	    
	    //4.Adding the WeekdayStudent
	    WeekdayStudent wdstu=new WeekdayStudent("Rama","Blore","Enabled",15000.0,00.0,
	    		                                "7.00 A.M","Mathikhere","B.Tech","81.9.",7);
	    it=(Integer)session.save(wdstu);
	    System.out.println(it.intValue());
	    
	    //5.Adding the WeekendStudent
	    WeekendStudent westu=new WeekendStudent("Trisha","Blore","Enabled",15000.0,00.0,
	    		           "11.00 A.M","BTM","J.P.MorganChase","Trisha@jpmorganchase.com",18.0);
	    it=(Integer)session.save(westu);
	    System.out.println(it.intValue());
	    
	    tx.commit();
		session.close();
		}catch(Exception e)
		{
		e.printStackTrace();
		tx.rollback();
	    }
      }
    }