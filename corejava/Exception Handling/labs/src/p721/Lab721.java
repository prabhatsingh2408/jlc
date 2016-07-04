package p721;

public class Lab721 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/3;
			System.out.println("Result is :" + res);
			return;
		}
		catch(Exception e){
			System.out.println("Invalid input");
		}
				System.out.println("Main Completed");
	}
}
