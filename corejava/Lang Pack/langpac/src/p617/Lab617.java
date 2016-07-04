package p617;

import java.util.Scanner;

public class Lab617 {
public static void main(String[] args) {
	String st1 = "JLC";
	String st2 = "JLC";
	System.out.println(st1==st2);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter JLC String");
	String st3=sc.nextLine();
	System.out.println("Re Enter JLC String");
	String st4 = sc.nextLine();
	System.out.println(st3==st4);
}
}
