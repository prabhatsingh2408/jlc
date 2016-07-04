package util;

import java.util.*;

public class Lab849{
public static void main(String[] args) {
	List list =new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Samar");
	list.add("Vansh");
	list.add("Nivas");
	System.out.println("List :" + list);
	System.out.println("\n Sorting in Ascending");
	Collections.sort(list);
	System.out.println(list);
	System.out.println("\n Sorting in Decending");
	Collections.sort(list, new StringDescComp());
	System.out.println(list);
	}	
	}
class StringDescComp implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}