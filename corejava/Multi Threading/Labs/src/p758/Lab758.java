package p758;

public class Lab758 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("JLC");
		MyThread t1 = new MyThread(tg,"Hello");
		MyThread t2 = new MyThread(tg,"Hai");
	}
	}
	class MyThread implements Runnable{
		MyThread(ThreadGroup tg,String tname){
			Thread t=new Thread(tg,this,tname);
			t.start();
		}
		public void run(){
			Thread th= Thread.currentThread();
			ThreadGroup tg= th.getThreadGroup();
			System.out.println("Thread name is :" + th.getName());
			System.out.println("Thread Group name is :" + tg.getName());
		}

}
