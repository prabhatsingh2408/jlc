
package p18;

public class Test18 {
	public static void main(String[] args) {
		String nm1 = new String("SRI");
		String nm2 = new String("SRI");
		Student s1 = new Student(nm1);
		Student s2 = new Student(nm2);
		System.out.println(s1.equals(s2));
	}
	}
	class Student{
		String name;
		Student(String name){
			this.name=name;
		}
		public boolean equals(Object st){
			return this.name.equals(st.name);
		}
}
