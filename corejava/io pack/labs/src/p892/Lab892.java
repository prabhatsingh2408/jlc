package p892;

import java.io.*;
public class Lab892 {
	public static void main(String[] args)throws Exception {
		try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Address ad=new Address("33/1","Mathikhere");
			Student st=new Student(99,"Sri",6579999,ad);
			Student.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
		}catch(Exception e){
			e.printStackTrace();
		}
		}
        }
class Address {	
String aid;
String street;
Address(){}
Address(String aid,String street){
	this.aid=aid;
	this.street=street;
}
public String toString(){
	return aid+"\t"+street;
}
}
class Student implements Externalizable{
	int sid;
	transient String name="XXXX";
	long phone=33333;
	static int count=3;
	Address add;
	public Student(){}
	Student(int sid,String name,long phone,Address add){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		this.add=add;
	}
	public String tostring(){
		return sid+"\t"+name+"\t"+phone+"\t"+count+"\t"+add;
	}
	public void writeExternal(ObjectOutput out)throws IOException{
		out.writeInt(count);
		out.writeObject(name);
		out.writeObject(add.aid);
		out.writeObject(add.street);
	}
	public void readExternal(ObjectInput in)throws IOException,
		ClassNotFoundException{
	    count=in.readInt();
	    name=in.readObject().toString();
	    add=new Address();
	    add.aid=in.readObject().toString();
	    add.street=in.readObject().toString();
		}
	}