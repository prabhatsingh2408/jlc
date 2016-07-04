class Lab334
{
public static void main(String args[]){

Student stu1=new Student();
stu1.show();
Student stu2=new Student(99,"PRABHAT");
stu2.show();
}
}
class Student{
int sid;
String sname;
Student(){
System.out.println("Student Default Constructor");
}
Student(int id ,String sn){
System.out.println("Student 2-Arg Constructor");
sid=id;
sname=sn;
}
void show(){
System.out.println(sid + "\t" + sname);
}
}