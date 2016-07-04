package p14;

public class Test14 {
	public static void main(String[] args) {
		Student s1 = new Student("SRI");
		Student s2 = new Student("SRI");
		System.out.println(s1.equals(s2));
	}
	}
	class Student{
		String name;
		Student(String name){
			this.name=name;
		}
		public boolean equals(Student st){
			return this.name==st.name;
		}
}
