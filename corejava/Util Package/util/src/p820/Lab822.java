package p820;

import java.util.*;

public class Lab822 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new SBComparator());
		ts.add(new StringBuilder("Manish"));
		ts.add(new StringBuilder("Sri"));
		ts.add(new StringBuilder("Nivas"));
		ts.add(new StringBuilder("Rahul"));
		ts.add(new StringBuilder("Abhi"));
		Iterator it=ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	}
	class SBComparator implements Comparator{
		public int compare(Object ob1,Object ob2){
		if(ob1 instanceof StringBuilder && ob2 instanceof StringBuilder){
				String s1=ob1.toString();
				String s2=ob2.toString();
				return s1.compareTo(s2);       //DESC
				//return s2.compareTo(s1);     //ASC
			}
			return 0;
}
}