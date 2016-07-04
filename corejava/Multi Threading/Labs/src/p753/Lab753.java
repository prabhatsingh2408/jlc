package p753;

public class Lab753 {
public static void main(String[] args) {
	MyThread t1 = new MyThread();
	MyThread t2 = new MyThread();
}
}
class MyThread extends Thread{
	MyThread(){
		start();
	}
	public void run(){
		Thread th= Thread.currentThread();
		ThreadGroup tg= th.getThreadGroup();
		System.out.println("Thread name is :" + th.getName());
		System.out.println("Thread Group name is :" + tg.getName());
	}
}