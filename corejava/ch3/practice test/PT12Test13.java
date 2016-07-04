class PT12Test13
{
public static void main(String args []){
new B();

}}
class A{
static{
System.out.println("A  S.B");
}
}
class B extends A{
static{
System.out.println("B   S.B");
}
}