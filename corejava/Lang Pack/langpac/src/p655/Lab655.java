package p655;

public class Lab655 {
	public static void main(String[] args) {
		String str="JLC,Java Learning Center. No 1 in Java Training And Placement.Java is a popular Language";
		String res[]=str.split("Java",1);
		System.out.println("Length :" + res.length);
		for(int i=0;i<res.length;i++){
			String st=res[i];
			System.out.println(i + "\t" + st);
}
		String res1[]=str.split("Java",2);
		System.out.println("Length :" + res1.length);
		for(int i=0;i<res1.length;i++){
			String st1=res1[i];
			System.out.println(i + "\t" + st1);
		}
	}
}