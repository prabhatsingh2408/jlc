package p769;

import java.util.ArrayList;

public class Lab769 {
	public static void main(String[] args) {
		Hello h1=new Hello();
		MyThread th1=new MyThread(h1);
		MyThread th2=new MyThread(h1);
		th1.start();
		th2.start();
		}
	}
	class MyThread extends Thread{
		Hello h;
		MyThread(Hello h){
			this.h=h;
		}
		public void run(){
			h.show();
		}
	}
	class Hello{
		synchronized void show(){
			ArrayList al=new ArrayList();
			Thread th=Thread.currentThread();
			for(int i=0;i<5;i++){
				try{
					wait(1000);
					//al.wait(1000);
					System.out.println(th.getName()+"  -SHOW :"+i+"\t"+this);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}