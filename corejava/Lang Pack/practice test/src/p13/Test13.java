
package p13;

public class Test13 {
	public static void main(String[] args) {
		Student s1 = new Student(99);
		Student s2 = new Student(99);
		System.out.println(s1.equals(s2));
	}
	}
	class Student{
		int sid;
		Student(int sid){
			this.sid=sid;
		}
		public boolean equals(Student st){
			return this.sid==st.sid;
		}
	}
