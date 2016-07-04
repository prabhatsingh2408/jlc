package p611;

public class Lab611 {
public static void main(String[] args) {
	System.out.println("*******MAIN STARTED*******");
	Runtime rt = Runtime.getRuntime();
	System.out.println("T : " + rt.totalMemory());
	System.out.println("M : " + rt.maxMemory());
	System.out.println("F : " + rt.freeMemory());
}
}
