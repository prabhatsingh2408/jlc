package p25;

public class Test25 {
	public static void main(String[] args) throws Exception{
		Hello h1 = new Hello(99);
		Object h2 = h1.clone();
		System.out.println(h1==h2);
	}
	}
	class Hello{
     int a;
     Hello(int a){
    	 this.a=a;
     }
     protected Object clone() {
    	 return new Hello(a);
		}
}
