package t20;

public class Test20 {
public static void main(String[] args) {
	Hello h=new Hello();
	h.process();
	System.out.println("JLC");
}
}
class Hello{
	public int process(){
		throw new NullPointerException();
	}
}
