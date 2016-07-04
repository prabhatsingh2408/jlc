package util;

import java.util.*;

public class Lab856{
public static void main(String[] args) {
	Date dt=new Date();
	System.out.println(dt);
	System.out.println("Date\t:" + dt.getDate());
	System.out.println("Month\t:" + dt.getMonth());
	System.out.println("Month+1\t:" + (dt.getMonth()+1));
	System.out.println("Year\t:" + dt.getYear());
	System.out.println("Year+1900\t:" + (dt.getYear()+1900));
	System.out.println("Hour\t:" + dt.getHours());
	System.out.println("MIN\t:" + dt.getMinutes());
	System.out.println("SEC\t:" + dt.getSeconds());
	System.out.println("\n**Sorting Date:");
	dt.setDate(28);
	dt.setMonth(8);
	dt.setYear(115);
	System.out.println(dt);
	}	
	}
