class Lab343
{
public static void main(String args[]){

Student stu1=new Student(88,"SRINIVAS");
stu1.show();
Student stu2=new Student(99,"DANDE");
stu2.show();
}
}
class Student{
int sid;
String sname;
Student(int sid ,String sname){
System.out.println("Student 2-Arg Constructor");
this.sid=sid;
this.sname=sname;
}
void show(){
System.out.println(sid + "\t" + sname);
}
}