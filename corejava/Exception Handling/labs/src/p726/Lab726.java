package p726;

public class Lab726 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int r=new Hello().show();
		System.out.println("Main : "+r);
		System.out.println("Main Completed");
	}
}
class Hello{
	int show(){
		int a=0;
		try{
			System.out.println("Try block begins :"+a);
			a=10/0;
			System.out.println("Try block ends :"+a);
			return a;
		}catch(ArithmeticException e){
			a=20;
			System.out.println("Catch block begins :" +a);
			return a;
		}
		finally{
			a=30;
			System.out.println("finally block :" +a);
		}
	}

}
