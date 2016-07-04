package p757;

public class Lab757 {
	public static void main(String[] args) {
		ThreadGroup tg =new ThreadGroup("JLC");
		MyThread t1 = new MyThread(tg,"Hello");
		MyThread t2 = new MyThread(tg,"Hai");
	}
	}
	class MyThread extends Thread{
		MyThread(ThreadGroup tg,String tname){
			super(tg,tname);
			start();
		}
		public void run(){
			Thread th= Thread.currentThread();
			ThreadGroup tg= th.getThreadGroup();
			System.out.println("Thread name is :" + th.getName());
			System.out.println("Thread Group name is :" + tg.getName());
		}

}
