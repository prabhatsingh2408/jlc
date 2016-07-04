package p766;

public class Lab766 {
	public static void main(String[] args) {
		Hello h1=new Hello();
		Hello h2=new Hello();
		MyThread th1=new MyThread(h1);
		MyThread th2=new MyThread(h1);
		//MyThread th2=new MyThread(h2);
		th1.start();
		th2.start();
		}
	}
	class MyThread extends Thread{
		Hello h=null;
		MyThread(Hello h){
			this.h=h;
		}
		public void run(){
			h.show();
		}
	}
	class Hello{
		synchronized static void show(){
			Thread th=Thread.currentThread();
			for(int i=0;i<5;i++){
				System.out.println(th.getName()+"  -SHOW :"+i+"\t");
				try{
					Thread.sleep(500);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}