package util;

import java.util.*;

public class Lab847{
public static void main(String[] args) {
	List list =new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Nivas");
	list.add("Vansh");
	list.add("Nivas");
	System.out.println("List  :" + list);
	System.out.println("\n Replacing Nivas with JLC");
	Collections.replaceAll(list,"Nivas","JLC");
	System.out.println(list);
	Object mx=Collections.max(list);
	System.out.println("\n Max OBJ :"+ mx);
	Object mn=Collections.min(list);
	System.out.println("\n MIN OBJ :" +mn);
	System.out.println("\n Replacing All with JLC");
	Collections.fill(list,"JLC");
	System.out.println(list);
	}	
	}
