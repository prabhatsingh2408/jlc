package p711;

public class Lab711 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			String data=args[0];
			int x= Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result is :" + res);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Provide one value as CLA");
		}
		catch(NumberFormatException e){
			System.out.println("Provide int value as CLA");
		}
		catch(ArithmeticException e){
			System.out.println("Provide non zero int value as CLA");
		}
		System.out.println("Main Completed");
	}
}
