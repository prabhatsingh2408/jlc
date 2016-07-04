package p903;

import java.lang.reflect.*;
public class Lab907 {
public static void main(String[] args)throws Exception {
	String cname="p903.Hai";
	Class cl=Class.forName(cname);
	System.out.println("\n **PUBLIC INNER CLASS**");
	Class[] pic=cl.getClasses();
	for(int i=0;i<pic.length;i++){
		Class c=pic[i];
		System.out.println(c);
	}
	System.out.println("\n**DECLARED INNER CLASS**");
	Class[] dic=cl.getDeclaredClasses();
	for(int i=0;i<dic.length;i++){
		Class c=dic[i];
		System.out.println(c);
	}
}
}