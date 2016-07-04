package util;

import java.util.*;

public class Lab857{
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	System.out.println(cal);
	Date dt=cal.getTime();
	System.out.println("Time\t:" + dt);
	System.out.println("Date\t:" + cal.get(Calendar.DATE));
	System.out.println("Day of Month\t:" + cal.get(Calendar.DAY_OF_MONTH));
	System.out.println("Month\t:" + cal.get(Calendar.MONTH));
	System.out.println("Month+1\t:" + (cal.get(Calendar.MONTH)+1));
	System.out.println("Year\t:" + cal.get(Calendar.YEAR));
	System.out.println("Hour\t:" + cal.get(Calendar.HOUR));
	System.out.println("Hour of Day\t:" + cal.get(Calendar.HOUR_OF_DAY));
	System.out.println("MIN\t:" + cal.get(Calendar.MINUTE));
	System.out.println("SEC\t:" + cal.get(Calendar.SECOND));
	System.out.println("AM_PM\t:"+cal.get(Calendar.AM_PM));
	System.out.println("\nAdding 7 Days");
	cal.add(Calendar.DATE,7);
	System.out.println(cal.getTime());
	System.out.println("\n set Month as March");
	cal.set(Calendar.MONTH,Calendar.MARCH);
	System.out.println(cal.getTime());
	}	
	}
