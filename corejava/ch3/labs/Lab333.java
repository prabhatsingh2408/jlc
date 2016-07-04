class Lab333
{
public static void main(String args[]){

Student stu1=new Student(88,"SRINIVAS");
stu1.show();
Student stu2=new Student(99,"PRABHAT");
stu2.show();
}
}
class Student{
int sid;
String sname;
Student(int id, String sn){
System.out.println("Student 2-Arg Constructor");
sid=id;
sname=sn;
}
void show(){
System.out.println(sid + "\t" + sname);
}
}