package p746;

public class Lab746 {
public static void main(String[] args) {
	System.out.println("Main Started");
	try(JLCResourceres =new JLCResource();)
	{
		int x=10/0;
	}
	System.out.println("Main ends");
}
}
class JLCResource implements AutoCloseable{
	public void close(){}
}