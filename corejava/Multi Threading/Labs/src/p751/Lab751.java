package p751;

public class Lab751 {
public static void main(String[] args) {
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	t1.start();
	t2.start();
	Thread t =Thread.currentThread();
	for(int i=100;i<=110;i++){
		System.out.println(t.getName()+"\t"+ "- value is :"+i);
		try{
			Thread.sleep(500);
		}catch(Exception e){e.printStackTrace();}
	}
}
}
class MyThread extends Thread{
	//public MyThread (String tname){
	//super(tname);	}
		public void run(){
		Thread th =Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(th.getName()+"- value is :" +i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}