package p628;

public class Lab628 {
public static void main(String[] args) {
	System.out.println("ABC".compareTo("ABC"));
	System.out.println("ABC".compareTo("ADO"));
	System.out.println("ABC".compareTo("ABCDEFG"));
	System.out.println("ABCDEFG".compareTo("ADC"));
	System.out.println("ABC".compareTo("DEF"));
	System.out.println("ABC".compareTo("abc"));
	System.out.println("ABC".compareToIgnoreCase("abc"));
}
}
