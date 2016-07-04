package util;

import java.util.*;

public class Lab834{
public static void main(String[] args) {
	System.out.println("\n ** Using Generics with map **");
	Map<Integer,String> map =new LinkedHashMap<Integer,String>();
	map.put(1234,"Srinivas");
	map.put(8787,"Manish");
	map.put(2727,"Samar");
	map.put(9999,"Vansh");
	map.put(1818,"Veronika");
	Set<Map.Entry<Integer,String>> set=map.entrySet();
	Iterator<Map.Entry<Integer,String>> it=set.iterator();
	while(it.hasNext()){
		Map.Entry<Integer,String> entry=it.next();
		Integer key=entry.getKey();
		String value=entry.getValue();
		System.out.println(key + "\t\t" + value);
	}	
	}
	}
