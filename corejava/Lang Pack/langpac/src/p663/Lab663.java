package p663;

public class Lab663 {
public static void main(String[] args) {
	StringBuilder sb =new StringBuilder("JLC");
	System.out.println("C :" +sb.capacity());
	System.out.println("L :" +sb.length());
	sb.trimToSize();
	System.out.println("C :" +sb.capacity());
	System.out.println("L :" +sb.length());
}
}
