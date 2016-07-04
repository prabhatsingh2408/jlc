package util;

import java.util.*;

public class Lab858{
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	Calendar today=Calendar.getInstance();
	cal.set(Calendar.DATE,23);
	cal.set(Calendar.MONTH,9);
	cal.set(Calendar.YEAR,2011);
	System.out.println(cal);
	System.out.println("AFTER TODAY :" + today.after(cal));
	System.out.println("BEFORE TODAY :" + today.before(cal));
	System.out.println("CompareTo :" + today.compareTo(cal));
	}	
	}
