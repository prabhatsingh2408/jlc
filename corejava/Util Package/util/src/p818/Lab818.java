package p818;

import java.util.*;

public class Lab818 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new Student(99,"Sri"));
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