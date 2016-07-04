package util;

import java.util.*;
public class Lab784 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dande");
		System.out.println(col);
		System.out.println("col :" +"\t"+ col.size());
		Collection col1=new ArrayList();
		col1.add("JLC");
		col1.add("Java");
		col1.add("JDBC");
		System.out.println(col1);
		System.out.println("col1 :" + "\t" +col1.size());
		col.add(col1);
		System.out.println(col);
		System.out.println("col :"+ "\t" + col.size());
		}
		}
