package p722;

public class Lab722 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/3;
			System.out.println("Result is :" + res);
			return;
		}
		catch(NumberFormatException e){
			System.out.println("Invalid input");
		}
		finally{
				System.out.println("Main Completed");
	}}
}
