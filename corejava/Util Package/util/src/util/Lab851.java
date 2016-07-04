package util;

import java.util.*;

public class Lab851{
public static void main(String[] args) {
	List list =new ArrayList();
	list.add("Srinivas");
	list.add("Dande");
	list.add("Samar");
	list.add("Vansh");
	list.add("Nivas");
	System.out.println("List :" + list);
	List synclist=Collections.synchronizedList(list);
	System.out.println("\nSync :" + synclist);
	List unmodi=Collections.unmodifiableList(list);
	System.out.println("unmodifiable list :" + unmodi);
	System.out.println("\nModifying List");
	list.add("Manish");
	System.out.println("\nList :" + list);
	System.out.println("un modi :" + unmodi);
	unmodi.add("JLCINDIA");//java.lang.UnsupportedOperationException
	}	
	}
