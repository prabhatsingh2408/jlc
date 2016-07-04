package p756;

public class Lab756 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Hello");
		MyThread t2 = new MyThread("Hai");
	}
	}
	class MyThread implements Runnable{
		MyThread(String tname){
			Thread t= new Thread(this,tname);
			t.start();
		}
		public void run(){
			Thread th= Thread.currentThread();
			ThreadGroup tg= th.getThreadGroup();
			System.out.println("Thread name is :" + th.getName());
			System.out.println("Thread Group name is :" + tg.getName());
		}

}
