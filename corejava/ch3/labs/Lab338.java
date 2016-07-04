class Lab338
{
public static void main(String args[]){

Student stu=new Student(55,"SD");
stu.show();
}
}
class Student{
int sid;
String sname;
void Student(int id ,String sn){
System.out.println("Student 2-Arg Constructor");
sid=id;
sname=sn;
}
void show(){
System.out.println(sid + "\t" + sname);
}
}