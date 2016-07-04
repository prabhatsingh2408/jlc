package util;

import java.util.*;
public class Lab791 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("Nivas");
		list.add("JDBC");
		System.out.println(list);
		int x=list.indexOf("Nivas");
		System.out.println(x);
		int y=list.lastIndexOf("Nivas");
		System.out.println(y);
		}
		}
