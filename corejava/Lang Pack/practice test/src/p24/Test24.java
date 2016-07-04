package p24;

public class Test24 {
	public static void main(String[] args) throws Exception{
		Hello h1 = new Hello(99);
		Object h2 = h1.clone();
		System.out.println(h1==h2);
	}
	}
	class Hello implements Cloneable{
		int a;
		Hello(int a){
			this.a=a;
		}
		protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		} 
}
