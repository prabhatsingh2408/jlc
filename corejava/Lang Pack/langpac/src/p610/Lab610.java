package p610;

public class Lab610 {
public static void main(String[] args) throws CloneNotSupportedException{
	Hai hai = new Hai(10);
	Hello h1 = new Hello(20,hai);
	Hello h2 = (Hello)h1.clone();
	System.out.println(h1==h2);
	System.out.println(h1.hai==h2.hai);
	h1.show();
	h2.show();
	h2.y=11;
	h2.hai.x=22;
	h1.show();
	h2.show();
}
}
class Hai{
	int x;
	Hai(int x){
		this.x=x;
	}
}
class Hello implements Cloneable{
	int y;
	Hai hai;
	Hello(int y,Hai hai){
		this.y=y;
		this.hai=hai;
	}
	void show(){
		System.out.println("Hello -> y :" + y);
		System.out.println("Hai - > x :" + hai.x);
	}
	public Object clone()throws CloneNotSupportedException{
		if(this instanceof Cloneable){
			Hai hai=new Hai(this.hai.x);
			Hello h=new Hello(this.y,hai);
			return h;
		}
		else
			throw new  CloneNotSupportedException(getClass().getName());
	}
}