package util;

import java.util.*;

public class Lab848{
public static void main(String[] args) {
	List list =new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Samar");
	list.add("Vansh");
	list.add("Nivas");
	System.out.println("List  :" + list);
	System.out.println("\n Reverse");
	Collections.reverse(list);
	System.out.println(list);
	System.out.println("\n Rotate (2)");
	Collections.rotate(list,2);
	System.out.println(list);
	System.out.println("\n Rotate (-3)");
	Collections.rotate(list,-3);
	System.out.println(list);
	System.out.println("\n SHUFFLE");
	for (int i=0;i<5;i++){
		Collections.shuffle(list);
		System.out.println(list);
	}
	}	
	}
