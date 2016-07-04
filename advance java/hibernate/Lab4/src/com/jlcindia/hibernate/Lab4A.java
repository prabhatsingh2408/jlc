package com.jlcindia.hibernate;
import org.hibernate.*;
import java.util.*;
import com.jlcindia.hibernate.HibernateUtil;

public class Lab4A {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
	    tx=session.beginTransaction();
		String cous[]={"Java","JDBC","JSP"};
		
		List<String> ems=new ArrayList<String>();
		ems.add("aa@jlc");
		ems.add("bb@jlc");
		ems.add("cc@jlc");
		
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(new Integer(100));
		marks.add(new Integer(99));
		marks.add(new Integer(98));
		
		Set<Long> phs=new HashSet<Long>();
		phs.add(new Long(1111));
		phs.add(new Long(2222));
		phs.add(new Long(3333));
		
		Map<String,Long> refs=new HashMap<String,Long>();
		refs.put("aaa",new Long(1111));
		refs.put("bbb",new Long(2222));
		refs.put("ccc",new Long(3333));
		
		Student stu=new Student("John","10-10-10","M.Sc",cous,ems,marks,phs,refs);
		session.save(stu);
		tx.commit();
		session.close();
		}catch(Exception e)
		{
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
	    }
      }
    }
