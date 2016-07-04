package util;

import java.util.*;
public class Lab792 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("Nivas");
		list.add("JDBC");
		List list2=list.subList(1,4);
		System.out.println(list);
		System.out.println(list2);
		}
		}
