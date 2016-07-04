class Lab336
{
public static void main(String args[]){

Student stu=new Student();
stu.Student(55,"SD");
stu.show();
}
}
class Student{
int sid;
String sname;
Student(int id ,String sn){
System.out.println("Student 2-Arg Constructor");
sid=id;
sname=sn;
}
Student(){
System.out.println("Student Default Constructor");
}

void show(){
System.out.println(sid + "\t" + sname);
}
}