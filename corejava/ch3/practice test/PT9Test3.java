class PT9Test3
{
public static void main(String []args)
{
Student st1=new Student();
Student st2=new Student();
st1.sname="SRI";
System.out.println(st1.sname + "\t" + st2.sname);
}
}
class Student{
static String sname;
}