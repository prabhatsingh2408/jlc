public class Some {
	public static void main(String args[]){
    	System.out.println("main	"+Some.x);
	}
	
	static {
    	System.out.println("static	"+Some.x);
	}
	static int x=90;
}