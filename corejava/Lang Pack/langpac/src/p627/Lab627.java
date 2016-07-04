package p627;

public class Lab627 {
public static void main(String[] args) {
String st1= new String("JLC");
String st2= new String("JLC");
String st3= new String("jlc");
System.out.println(st1+"\t"+st2+"\t"+st3);
System.out.println(st1==st2);
System.out.println(st1==st3);
System.out.println();
System.out.println(st1.equals(st2));
System.out.println(st1.equals(st3));
System.out.println(st1.equalsIgnoreCase(st3));
}
}
