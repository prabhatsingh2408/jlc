
public class Lab707 {
public static void main(String[] args) throws CloneNotSupportedException{
	Student st = new Student(99);
	System.out.println(st.sid);
	Student st2 = st.myclone();
	System.out.println(st2.sid);
	System.out.println(st==st2);
	
}
}
interface JLCClonable{}
class Student implements JLCClonable{
	int sid;
	Student(int sid){
		this.sid=sid;
	}
	public Student myclone() throws CloneNotSupportedException{
		if(this instanceof JLCClonable)
			return new Student(sid);
		else
			throw new
			CloneNotSupportedException("Implement JLCClonable");
	}
}