package p620;

public class Lab620 {
public static void main(String[] args) {
	String st1 = "JLCINDIA";
	String st2 = "JLC" + "INDIA";
	final String st3 = "JLC";
	final String st4 = "INDIA";
	String st5 = st3+st4;
	System.out.println(st1==st2);
	System.out.println(st1==st5);
}
}
