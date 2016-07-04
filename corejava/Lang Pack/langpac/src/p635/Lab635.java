package p635;

public class Lab635 {
public static void main(String[] args) {
	String str="JLC";
	String str1=str.trim();
	System.out.println(str + "\t" + str1);
	System.out.println(str==str1);
	String str2="  JLC   ";
	String str3=str2.trim();
	System.out.println(str2==str3);
	System.out.println(str2+"\t"+str2.length());
	System.out.println(str3+"\t"+str3.length());
}
}
