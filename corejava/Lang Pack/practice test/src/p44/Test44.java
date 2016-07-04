package p44;

public class Test44 {
public static void main(String[] args) {
	Float f1 = new Float(10.0f/0.0f);
	System.out.println(f1.isInfinite());
	System.out.println(f1.isNaN());
}
}
