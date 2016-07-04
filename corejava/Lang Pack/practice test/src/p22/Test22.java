package p22;

public class Test22 {
public static void main(String[] args) throws Exception{
	Hello h1 = new Hello();
	Object h2 = h1.clone();
	System.out.println(h1==h2);
}
}
class Hello{
	protected Object clone(){
		return this;
	}
}