package p916;

public class Lab916 {
	public static void main(String[] args) {
		Employee em=new Employee(99,"Sri");
		System.out.println(em);
	}
	}
	class Employee{
		int eid;
		String name;
		Employee(int eid,String name){
			this.eid=eid;
			this.name=name;
		}
		public String toString(){
		return eid+"\t"+name;
	}}