package util;

import java.util.*;
public class Lab786 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("JDBC");
		col.add("Srinivas");
		col.add("Dande");
		col.add("JSP");
		col.add("Java");
		//System.out.println(col);
		//System.out.println("col :" +"\t"+ col.size());
		Collection col1=new ArrayList();
		col1.add("JSP");
		col1.add("Java");
		col1.add("JDBC");
		//System.out.println(col1);
		//System.out.println("col1 :" + "\t" +col1.size());
		Collection col2=new ArrayList();
		col2.add("EJB");
		col2.add("Java");
		col2.add("JDBC");
		//System.out.println(col1);
		System.out.println(col + "\n" +col1+"\n"+col2);
		System.out.println(col.containsAll(col1));
		System.out.println(col.containsAll(col2));
		}
		}
