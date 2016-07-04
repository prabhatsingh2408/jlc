package p708A;

public class Lab708A {
public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer("JLC");
	Hello h1=new Hello (10,sb1);
	System.out.println(h1);
	System.out.println("****************************************************************************");
	sb1.append("INDIA");
	System.out.println(h1);
}
}
final class Hello{
	private final int a;
	private final StringBuffer b;
	Hello(int a,StringBuffer b){
		this.a=a;
		this.b=new StringBuffer(b);
	}
	public String toString(){
		return a+"\t"+b;
	}
	public int getA(){
		return a;
	}
	public StringBuffer getB(){
		return b;
	}
}