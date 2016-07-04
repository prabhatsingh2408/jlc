package util;

import java.util.*;
public class Lab778 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("sri");
		v.addElement("java");
		v.addElement("dande");
		
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Object o = (Object)e.nextElement();
			System.out.println(o);
		}
		}

}
