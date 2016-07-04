package p760;

public class Lab760 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("Hello");
		t2.setName("Hai");
		t1.start();
		t2.start();
	}
	}
	class MyThread extends Thread{
	public void run(){
			Thread th= Thread.currentThread();
			ThreadGroup tg= th.getThreadGroup();
			System.out.println("Thread name is :" + th.getName());
			System.out.println("Thread Group name is :" + tg.getName());
		}


}
