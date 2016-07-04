

public class Test7 {
	public static void main(String[] args) {
		Abc ob =new Abc();
		long a= ob.getPhone("");
		System.out.println(a);
	}
	}
	class Abc{
		long getPhone(String sid){
			if(sid!=null)
				return 9972368983L;
			else
				throw new NullPointerException();
		}
	}

