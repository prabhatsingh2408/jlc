package p26;

public class Test26 {
public static void main(String[] args) {
	Hello h1=new Hello(99,new Hai());
	Hello h2=(Hello)h1.clone();
	System.out.println(h1.hai==h2.hai);
}
}
class Hello{
	int a;
	Hai hai;
	Hello(int a,Hai hai){
		this.a=a;
		this.hai=hai;
	}
	protected Object clone(){
		return new Hello(a,hai);
	}
}
class Hai{}