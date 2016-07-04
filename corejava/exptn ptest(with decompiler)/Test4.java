

public class Test4 {
public static void main(String[] args) {
	Abc ob=new Abc();
	int a=ob.show();
	System.out.println(a);
}
}
class Abc{
	int show(){
		throw new ArithmeticException();
		return 0;
	}
}