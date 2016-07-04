package p820;

import java.util.*;

public class Lab820 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new NameComparator());
		ts.add(new Student(88,"Manish"));
		ts.add(new Student(44,"Sri"));
		ts.add(new Student(22,"Nivas"));
		ts.add(new Student(99,"Rahul"));
		ts.add(new Student(77,"Abhi"));
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	}
	class Student{
		int sid;
		String name;
		Student(int sid,String name){
			this.sid=sid;
			this.name=name;
		}
		public String toString(){
			return sid +"\t" + name;
		}
	}
	class NameComparator implements Comparator{
		public int compare(Object ob1,Object ob2){
			if(ob1 instanceof Student && ob2 instanceof Student){
				Student s1=(Student)ob1;
				Student s2=(Student)ob2;
				return s1.name.compareTo(s2.name);
			}
			return 0;

}
}