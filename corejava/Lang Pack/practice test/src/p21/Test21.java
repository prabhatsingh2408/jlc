package p21;

public class Test21 {
public static void main(String[] args) throws Exception{
	Hello h1 = new Hello();
	Object h2 = h1.clone();
	System.out.println("OK");
}
}
class Hello implements Cloneable{}