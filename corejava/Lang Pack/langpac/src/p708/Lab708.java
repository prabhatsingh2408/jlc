
package p708;

public class Lab708 {
public static void main(String[] args) {
	Student st =new Student(99,"Srinivas",65799999);
	System.out.println(st);
	}
}
final class Student{
	private final int sid;
	private final String name;
	private final long phone;
	public Student(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		}
	public int getSid(){
		return sid;
	}
	public String getName(){
		return name;
	}
	public long getPhone(){
		return phone;
	}
	public String toString(){
		return "Sid:"+sid+", Name :"+name+", Phone :"+ phone;
	}
}