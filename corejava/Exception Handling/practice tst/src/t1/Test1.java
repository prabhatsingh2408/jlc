package t1;

public class Test1 {
public static void main(String[] args) {
	try{
		int res=Integer.parseInt(("jlc"));
		System.out.println("Result :"+res);
	}catch(NumberFormatException e){
		int x=10/0;
		System.out.println("NFEx");
	}
	catch(ArithmeticException e){
		System.out.println("AEx");
	}
}
}
