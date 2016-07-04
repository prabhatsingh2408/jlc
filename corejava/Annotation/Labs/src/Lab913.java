import java.util.*;
public class Lab913 {
public static void main(String[] args) {
	Student st=new Student("Sri");
	System.out.println(st);
	Student st1=new Student(99,"Sri");
	System.out.println(st1);
}
}
class Student{
	int sid;
	String name;
	Student(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	@Deprecated
	Student(String name){}
	public String toString(){
	return sid+"\t"+name;
}}