package util;

import java.util.*;

public class Lab844{
public static void main(String[] args) {
	List list1 =new ArrayList();
	list1.add("Srinivas");
	list1.add("Manish");
	list1.add("Samar");
	list1.add("Vansh");
	System.out.println("List 1 :" + list1);
	//copy one list to another list
	List list2 =new ArrayList();
	list2.add("Java");
	list2.add("JDBC");
	list2.add("EJB");
	list2.add("Servlets");
	System.out.println("List 2 :" + list2);
	Collections.copy(list2,list1);
	System.out.println("List 2 :" + list2);
	System.out.println("List 1 :" + list1);
	}	
	}
