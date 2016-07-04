package p777;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab777 {
public static void main(String[] args) {
	MyThread th=new MyThread();
	ExecutorService ser=Executors.newFixedThreadPool(2);
	for(int i=0;i<5;i++){
		ser.execute(th);
	}
}
}
class MyThread implements Runnable{
	public void run(){
		Thread th=Thread.currentThread();
		for(int i=0;i<5;i++){
			System.out.println(th.getName()+"\t"+i);
			try{
				Thread.sleep(500);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println(th.getName()+"task Completed**");
	}
}