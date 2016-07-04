package t11;

public class Test11 {
public static void main(String[] args) {
	System.out.println("St1");
	MyException ex=null;
	throw ex;
}
}
class MyException extends RuntimeException{}