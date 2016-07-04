package p604;

public class Lab604 {
public static void main(String[] args) {
	Student st1=new Student(99,"SRI");
	System.out.println(st1);
	System.out.println("\n*******************Default Implementation*********************");
	String cname = st1.getClass().getName();
	int hc =st1.hashCode();
	String hx=Integer.toHexString(hc);
	String msg= cname+"@"+hx;
	System.out.println(msg);
}
}
class Student{
	int sid;
	String name;
	Student(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
}