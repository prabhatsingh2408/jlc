package util;

import java.util.*;
public class Lab781 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Srini");
		col.add("SD");
		col.add("Dande");
		System.out.println(col.contains("Srinivas"));
		System.out.println(col.contains("Java"));
		System.out.println(col);
		System.out.println(col.contains("SD"));
		System.out.println(col.contains("JDBC"));
		System.out.println(col);
		col.clear();
		System.out.println(col);
		System.out.println("Size"+col.size());
		System.out.println("Empty :"+col.isEmpty());
		}
		}
