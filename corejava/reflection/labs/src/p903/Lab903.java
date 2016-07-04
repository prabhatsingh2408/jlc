package p903;

import java.io.*;

public class Lab903 {
public static void main(String[] args) {
try{
	String cname="p903.Student";
	Class cl=Class.forName(cname);
	showClassDetails(cl);
	Class cl2="OK".getClass();
	showClassDetails(cl2);
}catch(Exception e){
	e.printStackTrace();
}
}
static void showClassDetails(Class cl){
	System.out.println("\n**Name :"+ cl.getName());
	Class superclass=cl.getSuperclass();
	System.out.println("superclass :"+superclass.getName());
	Package pack=cl.getPackage();
	System.out.println("Package :"+pack.getName());
	Class interfs[]=cl.getInterfaces();
	System.out.println("interfaces implemented");
	for(int i=0;i<interfs.length;i++){
		Class intf=interfs[i];
		System.out.println("\t"+intf.getName());
	}
}
}
class Person implements Comparable{
	public int compareTo(Object o){
		return 0;
	}
}
class Student extends Person implements Serializable,Cloneable{}