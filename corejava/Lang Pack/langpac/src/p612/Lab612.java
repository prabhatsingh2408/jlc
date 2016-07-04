package p612;

class Hai{
	public void finalize(){
		System.out.println("Hai - finalize");
	}
}

class Hello{
	void show(){
		System.out.println("show()");
	}
	void m1(){
		System.out.println("m1- start");
		Hai hai1=new Hai();
		Hai hai2=new Hai();
		Hai hai3=new Hai();
	}
	public void finalize(){
		System.out.println("Hello - finalize");
	}
}
public class Lab612 {
public static void main(String[] args) {
	new Hello().show();
	Hello h1=new Hello();
	h1=null;
	Hello h2=new Hello();
	Hello h3=new Hello();
	h2=h3;
	new Hello().m1();
	System.runFinalization();
	System.gc();
	}
}
