package p761;

public class Lab761 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setPriority(10);
		//t1.setPriority(0);
		//t1.setPriority(11);
		System.out.println(t1);
	}
	}
	class MyThread extends Thread{}