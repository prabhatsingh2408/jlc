package p605;

public class Lab605 {
public static void main(String[] args) {
	Student st1=new Student(99,"SRI");
	Student st2=new Student(88,"NIVAS");
	System.out.println(st1);
	System.out.println(st2);
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
		return sid + "\t" + name;
	}
}