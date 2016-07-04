package t17;

public class Test17 {
public static void main(String[] args) {
	try{
		int a=0;
		int b=5/0;
	}catch (Exception e){
		System.out.println("Ex");
	}catch(ArithmeticException ae){
		System.out.println("AEx");
	}
}
}
