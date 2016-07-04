package p731;

public class Lab731 {
public static void main(String[] args) {
	System.out.println("Main() Started");
	try{
		new Hello().show();
	}catch(Exception e){
		System.out.println("\n catch block");
		System.out.println("EX : " + e);
		System.out.println("Message : " +e.getMessage());
		System.out.println("Cause : " + e.getCause());
		System.out.println("============================");
		e.printStackTrace();
	}
	System.out.println("Main completed");
}
}
class Hello{
	void show(){
		System.out.println("Show() begins");
		new A().m1();
		System.out.println("Show() ends");
	}
}
class A{
	void m1(){
		System.out.println("m1() begins");
		new B().m2();
		System.out.println("m1() ends");
	}
}
class B{
	void m2(){
		System.out.println("m2() begins");
		new C().m3();
		System.out.println("m2() ends");
	}
}
class C{
	void m3(){
		System.out.println("m3() started");
		int x=10/0;
		System.out.println("m3() ends");
	}
}