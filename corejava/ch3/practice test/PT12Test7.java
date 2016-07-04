class PT12Test7
{
public static void main(String args []){
B ref=new B();
ref.x=101;
System.out.println(ref.ref1.x);  //here on reference of B (ref) variable x is called having reference of A (ref1)
//System.out.println(ref1.x);    //object of A is created inside B class hence not reachable from main method
System.out.println(ref.x);
}}
class A{
int x=99;
}
class B extends A{
int y=88;
A ref1=new A();
}