package p715;

public class Lab715 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/0;
			System.out.println("Result is :" + res);
		}
		System.out.println("JLC");
		catch(NumberFormatException e){
			System.out.println("Invalid input");
		}
				System.out.println("Main Completed");
	}
}
