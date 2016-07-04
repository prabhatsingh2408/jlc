class PT12Test14
{
public static void main(String args []){
 B ref=null;
ref.x=101;
}}
class A{
static int x=99;
static{
System.out.println("A  S.B");
}
}
class B extends A{
static{
System.out.println("B   S.B");
}
}