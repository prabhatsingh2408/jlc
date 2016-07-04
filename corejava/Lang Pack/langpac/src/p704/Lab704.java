package p704;


public class Lab704 {
	public static void main(String[] args) {
		Hello h=Hello.getHello();
		System.out.println(h);
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());
		
	}
	}
	class Hello{
		private static Hello INS=null;
		
		private Hello(){}
		public static Hello getHello(){
			if(INS==null)
				INS=new Hello();
			return INS;
}
}