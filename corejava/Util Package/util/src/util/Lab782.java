package util;

import java.util.*;
public class Lab782 {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dande");
		Object arr[]=col.toArray();
		for(int i=0;i<=arr.length;i++){
			System.out.println(arr[i]);
			arr[i]="JLC";
	}
		System.out.println(col);
		}
		}
