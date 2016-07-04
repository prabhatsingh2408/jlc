package p689;

import java.util.*;

public class Lab689 {
public static void main(String[] args) {
	long time = System.currentTimeMillis();
	Date dt = new Date(time);
	System.out.println(dt);
	String pnm = System.getProperty("os.name");
	System.out.println("os name :" + pnm);
	System.setProperty("os.name","UNIX");
	String pnm1 = System.getProperty("os.name");
	System.out.println("os name :" + pnm1);
	System.setProperty("jlc.website","www.jlcindia.com");
	System.out.println(System.getProperty("jlc.website"));
}
}
