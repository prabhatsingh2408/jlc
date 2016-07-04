package p772;

public class Lab772 {
public static void main(String[] args) {
	Service s=new Service();
	s.start();
	for(char ch='A';ch<'J';ch++){
		System.out.println("Main Running" + ch);
		try{
			Thread.sleep(500);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
}
class Service extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Service Running"+i);
			if(i==5){
				int x=10/0;
			}
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}