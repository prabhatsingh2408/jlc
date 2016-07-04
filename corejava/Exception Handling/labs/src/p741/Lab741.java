package p741;

public class Lab741 {
	public static void main(String[] args) {
		try{
			Hello h=new Hello();
			h.m1();
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Hello{
	void m1()throws ArithmeticException , ArrayIndexOutOfBoundsException{
		try{
			m2();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("m1--OK");
			if(1==2){
				throw new ArrayIndexOutOfBoundsException();
			}
			else{
				throw new ArithmeticException("DON'T DO THIS");
			}
		}
	}
	void m2()throws ArrayIndexOutOfBoundsException{ m3(); }
	void m3()throws ArrayIndexOutOfBoundsException{
		try{
			m4();
		}catch(ArithmeticException e){
			System.out.println("m3---OK");
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	void m4()throws ArithmeticException{ m5(); }
	void m5()throws ArithmeticException{int x=10/0;}
}