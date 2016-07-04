package p752;

public class Lab752 {
	public static void main(String[] args) {
		MyThread th=new MyThread();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
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
