package p608;

public class Lab608 {

public static void main(String[] args) {
	Student st1=new Student(99,"SRI");
	Student st2=new Student(99,"SRI");
	Student st3=new Student(88,"PRABHAT");
	Student st4=st1;
	System.out.println("using==op");
	System.out.println(st1==st2);
	System.out.println(st1==st3);
	System.out.println(st1==st4);
	System.out.println(st2==st3);
	System.out.println("using equals()");
	System.out.println(st1.equals(st2));
	System.out.println(st1.equals(st3));
	System.out.println(st1.equals(st4));
	System.out.println(st2.equals(st3));
}
}
class Student{
	int sid;
	String sname;
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student st=(Student) obj;
			return this.sid==st.sid && this.sname.equals(st.sname);
		}
		return false;
	}
}