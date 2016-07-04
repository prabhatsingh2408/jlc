package p691;
import java.io.*;
public class Lab691 {
public static void main(String[] args) throws Exception {
	System.out.println("Message Using OUT");
	System.err.println("Message Using ERR");
	FileOutputStream fos = new FileOutputStream("out.txt");
	PrintStream ps = new PrintStream(fos);
	System.setOut(ps);
	for (int i=0; i<args.length;i++){
		System.out.println("Value" + i) ;
			}
	System.err.println("Message Using ERR");
} 
}
