class PT9Test14
{
public static void main(String []args){
new Student();
new Student();
System.out.println("main");
}}
class Student{
static{
System.out.println("Block");
}
}
