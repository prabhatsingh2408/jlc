package p706;

public class Lab706 {
public static void main(String[] args) {
	for(int i=0;i<10;i++)
		System.out.println(Hello.getHello());
	
}
}
class Hello{
	private static Hello h1=new Hello();
	private static Hello h2=new Hello();
	private Hello(){}
	public static Hello getHello(){
		if(Math.random()>0.5)
			return h1;
		else 
			return h2;
	}
	}
