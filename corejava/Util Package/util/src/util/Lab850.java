package util;

import java.util.*;

public class Lab850{
public static void main(String[] args) {
	List list =new ArrayList();
	list.add(new StringBuilder("Srinivas"));
	list.add(new StringBuilder("Dande"));
	list.add(new StringBuilder("Samar"));
	list.add(new StringBuilder("Vansh"));
	list.add(new StringBuilder("Nivas"));
	System.out.println("List :" + list);
	//Collections.sort(col);  //java.lang.ClassCastERxception
	System.out.println("\n Sorting StringBuffer");
	Collections.sort(list,new StringBuilderComp());
	System.out.println(list);
	}	
	}
class StringBuilderComp implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
}