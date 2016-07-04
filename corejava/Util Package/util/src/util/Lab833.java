package util;

import java.util.*;

public class Lab833{
public static void main(String[] args) {
	System.out.println("\n ** Using Generics with set **");
	Set<String> set =new HashSet<String>();
	set.add("Srinivas");
	set.add("Manish");
	set.add("Samar");
	set.add("Vansh");
	//set.add(new Integer(12));
	Iterator<String> it=set.iterator();
	while(it.hasNext()){
		String str=it.next();
		System.out.println(str);
	}	
	}
	}
