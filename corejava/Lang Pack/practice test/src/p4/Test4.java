package p4;

public class Test4 {
public static void main(String[] args) {
	Student st = new Student();
	System.out.println(st.hashCode());
}
}
class Student{
	public int hashCode(){
		return 7825414;
	}
}