package p714;

public class Lab714 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/0;
			System.out.println("Result is :" + res);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid input");
		}
				System.out.println("Main Completed");
	}
}
