package p773;

public class Lab773 {
public static void main(String[] args) throws Exception{
		Greetings g=new Greetings();
		g.start();
		g.join();
		System.out.println("Greetings ! from Java Learning Center");
	}
}
class Greetings extends Thread{
	public void run(){
		for(int i=10;i>=1;i--){
			try{
				System.out.println(i);
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
