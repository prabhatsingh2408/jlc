class Lab335
{
public static void main(String args[]){

Student stu1=new Student(99,"PRABHAT","prabhat@jlc",99999);
stu1.show();
Student stu2=new Student(99,"PRABHAT","prabhat@jlc");
stu2.show();
Student stu3=new Student(99,"PRABHAT");
stu3.show();
Student stu4=new Student(99);
stu4.show();

}
}
class Student{
int sid;
String sname;
String email;
long phone;

Student(int id,String sn,String em,long ph)
{
System.out.println("Student 4-arg Constructor");
sid=id;
sname=sn;
email=em;
phone=ph;
}

Student(int id,String sn,String em)
{
System.out.println("Student 3-arg Constructor");
sid=id;
sname=sn;
email=em;
}

Student(int id ,String sn)
{
System.out.println("Student 2-Arg Constructor");
sid=id;
sname=sn;
}

Student(int id)
{
System.out.println("Student 1-arg Constructor");
sid=id;
}

void show(){
System.out.println(sid + "\t" + sname +"\t" + email + "\t" + phone);
}
}