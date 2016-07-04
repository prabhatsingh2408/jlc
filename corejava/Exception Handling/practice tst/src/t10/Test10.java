package t10;

public class Test10 {
public static void main(String[] args) {
	System.out.println("St1");
	throw new MyException();
}
}
class MyException extends RuntimeException{}