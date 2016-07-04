package p653;

public class Lab653 {
	public static void main(String[] args) {
		char ch[]={'J','L','C','I','N','D','I','A'};
		byte by[]={65,66,67,97,98,99,49,50};
		String st1=new String(ch,3,5);
		String st2=new String(by,3,5);
		System.out.println("st1 :" + st1);
		System.out.println("st2 :" + st2);
}
}