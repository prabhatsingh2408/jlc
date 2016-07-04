class Lab332
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
Student(int id, String sn){
System.out.println("Student 2-Arg Constructor");
sid=id;
sname=sn;
}
void show(){
System.out.println(sid + "\t" + sname);
}
}