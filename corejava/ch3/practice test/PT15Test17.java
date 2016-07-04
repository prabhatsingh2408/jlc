class PT15Test17
{
public static void main(String []args){
new B().m1();
System.out.println(C.x);
}
}
abstract class A{
static int x=90;
void m1(){}
}
class B extends A{
B(){x=80;}
void m1(){
System.out.println("B -> m1");
}
}
class C extends A{}