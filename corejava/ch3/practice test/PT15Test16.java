class PT15Test16
{
public static void main(String []args){
System.out.println(new B().x);
}
}
abstract class A{
int x=99;
A(){
System.out.println("A -> D.C");
}
static{
System.out.println("A -> S.B");
}
}
class B extends A{
static{
System.out.println("B -> S.B");
}
}