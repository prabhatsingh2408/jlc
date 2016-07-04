package p2;

public class Test2 {
	public static void main(String[] args) {
		Student st =  new Student();
		Class cl = st.getClass();
		String name = cl.getName();
		System.out.println(name);
	}
	}
	class Student{}
