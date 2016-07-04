package util;

import java.util.*;

public class Lab826 {
public static void main(String[] args) {
	Map map=new LinkedHashMap();
	map.put("eid",new Integer(99));
	map.put("name","Srinivas");
	map.put("phone",new Long(65799999L));
	System.out.println("\n ** keys");
	Set keys=map.keySet();
	Iterator it=keys.iterator();
	while(it.hasNext()){
		Object key=it.next();
		System.out.println(key);
	}
	System.out.println("\n ** values");
	Collection col=map.values();
	Iterator it1=col.iterator();
	while(it1.hasNext()){
		Object val=it1.next();
		System.out.println(val);
	}
}
}
