package p903;
import java.lang.reflect.*;
public class Lab910 {
public static void main(String[] args) {
	try{
	String cname="p903.Emp";
	Class cl=Class.forName(cname);
	Class paramsReqd[]=new Class[] { int.class,String.class,int.class,long.class};
	Constructor c=cl.getDeclaredConstructor(paramsReqd);
	System.out.println(c);
	Class paramsReqd1[]=new Class[]{String.class,int.class};
	Constructor c1=cl.getDeclaredConstructor(paramsReqd1);
	System.out.println(c1);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(NoSuchMethodException e){
		System.out.println("\n Required Constructor not found");
	}
	}
}
class Emp{
	Emp(int eid,String nm,int age,long phone){}
	Emp(int eid,String nm){}
}