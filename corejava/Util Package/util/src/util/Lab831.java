package util;

import java.util.*;

public class Lab831 {
public static void main(String[] args) {
	System.out.println("\n ** HashMap **");
	Map map=new HashMap();
	map.put("sid","JLC-099");
	map.put("name","Srinivas");
	map.put("phone","65799999L");
	map.put("email","sri@jlc.com");
	
	Map map2=new HashMap();
	map2.put("MKR","Mathikhere");
	map2.put("BTM","BTM Layout");
	System.out.println(map);
	System.out.println(map2);
	map.putAll(map2);
	System.out.println(map);
	System.out.println(map2);
	}
	}
