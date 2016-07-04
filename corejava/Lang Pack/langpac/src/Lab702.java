
public class Lab702 {
public static void main(String[] args) {
	Hello h=Hello.getHello();
	System.out.println(h);
	System.out.println(Hello.getHello());
	System.out.println(Hello.getHello());
	//h.clone();
	
}
}
class Hello{
	private static Hello INS =new Hello();
	private Hello(){}
	public static Hello getHello(){
		return INS;
	}
}