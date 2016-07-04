package p664;

public class Lab664 {
public static void main(String[] args) {
	String str="JLC";
	StringBuilder sb=new StringBuilder("JLC");
	System.out.println(str.contentEquals(sb));
	System.out.println(str.equals(sb));
}
}
