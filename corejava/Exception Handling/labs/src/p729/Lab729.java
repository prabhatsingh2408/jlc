package p729;

public class Lab729 {
	public static void main(String[] args) {
		System.out.println("Main() Started");
		new Hello().show("3");
		System.out.println("Main() Completed");
	}
	}
	class Hello{
		void show(String str){
			System.out.println("show() called");
			try{
				System.out.println("Try block started");
				int a=Integer.parseInt(str);
				int b=10/a;
				System.out.println("Try block completed" + b);
							}catch(ArithmeticException e){
				System.out.println("catch block");
				System.exit(0);
			}finally{System.out.println("finally block");}
		}
}
