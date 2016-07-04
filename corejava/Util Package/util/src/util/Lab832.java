package util;

import java.util.*;

public class Lab832{
public static void main(String[] args) {
	System.out.println("\n ** Using Generics with list **");
	List<String> list =new ArrayList<String>();
	list.add("Srinivas");
	list.add("Manish");
	list.add("Samar");
	list.add("Vansh");
	//list.add(new Integer(12));
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		String str=it.next();
		System.out.println(str);
	}	
	}
	}
