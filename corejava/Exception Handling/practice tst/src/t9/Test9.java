package t9;

public class Test9 {
public static void main(String[] args) {
	System.out.println("St1");
	throw new MyException();
}
}
class MyException{}