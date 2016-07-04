package com.jlcindia.hibernate;
import org.hibernate.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab10D {
public static void main(String[] args) {
	Transaction tx=null;
	try
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
	   	tx=session.beginTransaction();
		
		WeekdayStudent wdst=new WeekdayStudent
				("Trisha","Zurich","Active",18000.0,0.0,
						"10:00-2:00","Merc","M.Tech","98%",2015);
		
		wdst.setSid(1);
		
		session.save(wdst);
		
	    tx.commit();
	    
	    session.close();
	}catch(Exception e){
		e.printStackTrace();
		tx.rollback();
		}
}
}