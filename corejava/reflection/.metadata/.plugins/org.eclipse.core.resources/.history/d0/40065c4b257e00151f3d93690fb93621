package p908;
import java.lang.reflect.*;
public class Lab908 {
public static void main(String[] args) {
	try{
		Class cl=Class.forName("JlcStudent");
		System.out.println("PUBLIC :"+Modifier.PUBLIC);
		System.out.println("PRIVATE :"+Modifier.PRIVATE);
		System.out.println("PROTECTED :"+Modifier.PROTECTED);
		System.out.println("FINAL :"+Modifier.FINAL);
		System.out.println("STATIC :"+Modifier.STATIC);
		System.out.println("NATIVE :"+Modifier.NATIVE);
		System.out.println("ABSTRACT :"+Modifier.ABSTRACT);
		System.out.println("SYNCHRONIZED :"+Modifier.SYNCHRONIZED);
		Method ms[]=cl.getDeclaredMethods();
		for(int i=0;i<ms.length;i++){
			Method m=ms[i];
			System.out.println("\n*****"+m);
			int mod=m.getModifiers();
			System.out.println("Modifier :"+ mod);
			String str=Modifier.toString(mod);
			System.out.println("STR :"+str);
			System.out.println("PUBLIC :"+Modifier.isPublic(mod));
			System.out.println("PRIVATE :"+Modifier.isPrivate(mod));
			System.out.println("PROTECTED :"+Modifier.isProtected(mod));
			System.out.println("FINAL :"+Modifier.isFinal(mod));
			System.out.println("STATIC :"+Modifier.isStatic(mod));
			System.out.println("NATIVE :"+Modifier.isNative(mod));
			System.out.println("ABSTRACT :"+Modifier.isAbstract(mod));
			System.out.println("SYNCHRONIZED :"+Modifier.isSynchronized(mod));
		}
	}catch(Exception e){
		System.out.println("JlcStudent class not found");
		e.printStackTrace();
	}
}
}
abstract class JlcStudent{
	public void m1(){}
	native final void m2();
	public synchronized void m3(){}
	protected abstract void m4();
	private static final void m5(){}
	void m6(){}
}