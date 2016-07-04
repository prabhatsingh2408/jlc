package util;

import java.util.*;
public class Lab779 {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("JLC-99","sri");
		p.put("JLC-88","java");
		p.put("JLC-77","dande");
		
		System.out.println(p);
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()){
			String pnm=(String)e.nextElement();
			String val=p.getProperty(pnm);
			System.out.println(pnm+"\t\t"+val);
		}
		}

}
