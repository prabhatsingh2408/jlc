package p747;

public class Lab747 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try()
		{
			int x=10/0;
		}
		System.out.println("Main ends");
	}
	}
	class JLCResource implements AutoCloseable{
		public void close(){}
}
