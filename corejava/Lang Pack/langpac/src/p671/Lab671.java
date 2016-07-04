package p671;

public class Lab671 {
public static void main(String[] args) {
	String str="12345";
	Integer in=new Integer(str);
	System.out.println(in);
	String s2="123";
	Byte by=new Byte(s2);
	System.out.println(by);
	Boolean b1 =new Boolean(true);
	System.out.println(b1);
	Boolean b2 =new Boolean("JLC");
	System.out.println(b2);
	Integer in2=new Integer("12.0");//NFE
	String st="A";
	Character ch = new Character(st.charAt(0));
}
}
