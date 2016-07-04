

public class Test18 {
public static void main(String[] args) {
	try(MyRes res = new MyRes();){}
}
}
class MyRes implements AutoCloseable{
	public void close(){
		System.out.println("Close" +
				"");
	}
}