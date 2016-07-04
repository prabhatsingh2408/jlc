class Lab331
{
public static void main(String args[]){

Student stu=new Student();
stu.sid=99;
stu.sname="SRINIWAS";
stu.show();

}
}
class Student{
int sid;
String sname;
Student(){
System.out.println("Student Default Constructor");
}
void show(){
System.out.println(sid + "\t" + sname);
}
}