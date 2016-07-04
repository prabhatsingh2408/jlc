package p889;
import java.io.*;

public class Lab889 {
	public static void main(String[] args)throws Exception {
		try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Student st=new Student(99,"Sri",6579999);
			Student.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
		}catch(Exception e){
			e.printStackTrace();
		}
		}
        }
//class Person implements Serializable{
class Person{
	String name="XXXX";
	long phone=33333;
}
class Student extends Person implements Serializable{
	int sid;
	static int count=3;
	Student(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
	}
	public String tostring(){
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
}