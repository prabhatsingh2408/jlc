package p606;

public class Lab606 {
public static void main(String[] args) {
	String st1 = new String ("SRINIVAS");
	String st2 = new String ("SRINIVAS");
	String st3 = new String ("DANDE");
	System.out.println("using==op");
	System.out.println(st1==st2);
	System.out.println(st1==st3);
	System.out.println("using equals");
	System.out.println(st1.equals(st2));
	System.out.println(st1.equals(st3));
}
}
