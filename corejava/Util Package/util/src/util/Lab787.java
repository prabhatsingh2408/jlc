package util;

import java.util.*;
public class Lab787 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("JDBC");
		col.add("Srinivas");
		col.add("Dande");
		col.add("JSP");
		col.add("Java");
		col.add("Sri");
		//System.out.println(col);
		//System.out.println("col :" +"\t"+ col.size());
		Collection col1=new ArrayList();
		col1.add("JSP");
		col1.add("Java");
		col1.add("JDBC");
		System.out.println(col);
		System.out.println(col1);
		System.out.println(col.removeAll(col1));
		System.out.println(col);
		System.out.println(col1);
		}
		}
