package p27;

public class Test27 {
public static void main(String[] args) {
	new Hello();
	System.out.println("OK");
}
}
class Hello{
	protected void finalize() throws Throwable{
		System.out.println("Hello -> finalize()");
	}
}