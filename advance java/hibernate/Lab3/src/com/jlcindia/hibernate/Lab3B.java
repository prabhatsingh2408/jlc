package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab3B {
public static void main(String[] args) {
	
	try
	{
		//1. Create Session Factory
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		//2. open session Factory
		Session session = sf.openSession();
		
		//3. Begin Transaction
	    Transaction	tx=session.beginTransaction();
		
		//4. Do your Operation
		Student stu=(Student)session.load(Student.class, 1);
		System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getDob());
		for(String cn:stu.getCourses()){
			System.out.println(cn);
		}
		
		System.out.println(stu.getEmails());
		System.out.println(stu.getMarks());
		System.out.println(stu.getPhones());
		System.out.println(stu.getRefs());
		
		//5. Commit Transaction
	    tx.commit();
	    
	    //6. Close Session
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		}
}
}
