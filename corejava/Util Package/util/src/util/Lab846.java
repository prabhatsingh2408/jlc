package util;

import java.util.*;

public class Lab846{
public static void main(String[] args) {
	Set s=Collections.singleton("JLC");
	System.out.println(s);
	s.add("Hello");
	//java.lang.UnsupportedOperationException
	List list=Collections.singletonList("JLC");
	System.out.println(list);
	list.add("Hello");
	//java.lang.UnsupportedOperationException
	}	
	}
