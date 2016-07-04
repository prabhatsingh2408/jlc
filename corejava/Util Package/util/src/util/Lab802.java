package util;

import java.util.*;
public class Lab802 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator lit=list.listIterator();
		System.out.println("Forward Order");
		while(lit.hasNext()){
			int indx=lit.nextIndex();
			Object obj=lit.next();
			System.out.println(indx+ "\t"+obj);
		}
		System.out.println("Reverse Order");
		while(lit.hasPrevious()){
			int indx=lit.previousIndex();
			Object obj=lit.previous();
			System.out.println(indx + "\t" + obj);
		}
		}
		}
