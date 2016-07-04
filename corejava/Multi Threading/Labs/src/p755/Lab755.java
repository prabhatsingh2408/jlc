package p755;

public class Lab755 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Hello");
		MyThread t2 = new MyThread("Hai");
	}
	}
	class MyThread extends Thread{
		MyThread(String tname){
			super(tname);
			start();
		}
		public void run(){
			Thread th= Thread.currentThread();
			ThreadGroup tg= th.getThreadGroup();
			System.out.println("Thread name is :" + th.getName());
			System.out.println("Thread Group name is :" + tg.getName());
		}

}
