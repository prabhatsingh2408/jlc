package util;

import java.util.*;
public class Lab813 {
	public static void main(String[] args) {
		TreeSet ts =new TreeSet();
        ts.add(10);
        ts.add(5);
        ts.add(7);
        ts.add(11);
        ts.add(3);
        ts.add(9);
        ts.add(4);
        ts.add(20);
       	System.out.println(ts);
       	System.out.println("--poll first/last--");
       	System.out.println(ts.pollFirst());
   		System.out.println(ts);
       	System.out.println(ts.pollLast());
   		System.out.println(ts);
       	System.out.println("--lower() < --");
       	System.out.println(ts.lower(8));
   		System.out.println(ts.lower(4));
   		System.out.println("--higher() > --");
       	System.out.println(ts.higher(8));
   		System.out.println(ts.higher(50));
   		System.out.println(ts.higher(5));
       	System.out.println("--ceiling() >= --");
   		System.out.println(ts.ceiling(9));
   		System.out.println(ts.ceiling(12));
       	System.out.println("--floor() <= --");
   		System.out.println(ts.floor(8));
   		System.out.println(ts.floor(3));
		}
		}
