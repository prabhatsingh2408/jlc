package util;

import java.util.*;

public class Lab845{
public static void main(String[] args) {
	List list =new ArrayList();
	list.add("Srinivas");
	list.add("Manish");
	list.add("Samar");
	list.add("Vansh");
	System.out.println("List  :" + list);
	System.out.println("\n List to Enumeration");
	Enumeration enm=Collections.enumeration(list);
	while(enm.hasMoreElements())
	System.out.println(enm.nextElement());
	Vector v=new Vector();
	v.add(99);
	v.add("Sri");
	v.add("sri@jlc.com");
	System.out.println("\n Enumeration to List");
	Enumeration enu=v.elements();
	List info=Collections.list(enu);
	System.out.println(info);
	}	
	}
