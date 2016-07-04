package p730;

public class Lab730 {
public static void main(String[] args) {
	System.out.println("Main started");
	try{
		System.out.println("Try block started");
		try{System.out.println("Inner Try in Try");}
		catch(Exception e){System.out.println("Inner Catch in Try");}
		finally{System.out.println("Inner Finally in Try");}
		System.out.println("Try block ends");
	}
	catch(Exception e){
		System.out.println("Catch block started");
		try{System.out.println("Inner Try in Catch");}
		catch(Exception e1){System.out.println("Inner catch in catch");}
		finally{System.out.println("Inner finally in catch");}
		System.out.println("Catch block ends");
	}
	finally{
		System.out.println("Finally block started");
		try{System.out.println("Inner Try in Finally");}
		catch(Exception e){System.out.println("Inner catch in Finally");}
		finally{System.out.println("Inner Finally in Finally");}
		System.out.println("Finally block ends");
	}
	System.out.println("Main completed");
}
}
