package p759;

public class Lab759 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("JLC");
		MyThread t1 = new MyThread(tg);
		MyThread t2 = new MyThread(tg);
	}
	}
	class MyThread implements Runnable{
		MyThread(ThreadGroup tg){
			Thread t=new Thread(tg,this);
			t.start();
		}
		public void run(){
			Thread th= Thread.currentThread();
			ThreadGroup tg= th.getThreadGroup();
			System.out.println("Thread name is :" + th.getName());
			System.out.println("Thread Group name is :" + tg.getName());
		}

}
