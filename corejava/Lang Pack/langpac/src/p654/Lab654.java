package p654;

public class Lab654 {
public static void main(String[] args) {
	String str="JLC,Java Learning Center. No 1 in Java Training And Placement.Java is a popular Language";
	String res[]=str.split("Java");
	System.out.println("Length :" + res.length);
	for(int i=0;i<res.length;i++){
		String st=res[i];
		System.out.println(i + "\t" + st);
	}
}
}
