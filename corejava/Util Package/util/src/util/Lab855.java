package util;

import java.util.*;

public class Lab855{
public static void main(String[] args) {
	int[] arr=new int[]{10,43,23};
	System.out.println("Len :" + arr.length);
	System.out.println(Arrays.toString(arr));
	arr=Arrays.copyOf(arr,5);
	System.out.println("Len :" + arr.length);
	System.out.println(Arrays.toString(arr));
	}	
	}
