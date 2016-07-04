package p748;

public class Lab748 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try(JLCResourceres =new JLCResource();)
		{
         Lab ref=new Lab();
         Object obj=ref.clone();
		}
		System.out.println("Main ends");
	}
	}
	class JLCResource implements AutoCloseable{
		public void close(){}
}
