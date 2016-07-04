package util;

import java.util.*;

public class Lab829 {
public static void main(String[] args) {
	System.out.println("\n ** LinkedHashMap **");
	Map map=new LinkedHashMap();
	map.put("sid","JLC-099");
	map.put("name","Srinivas");
	map.put("phone","65799999L");
	map.put("email","sri@jlc.com");
	map.put("add","Mathikhere");
		Set set=map.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}
}
