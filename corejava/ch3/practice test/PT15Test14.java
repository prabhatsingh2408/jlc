class PT15Test14
{
public static void main(String []args){
A ref=new B();
ref.m1();

}
}
abstract class A{
public abstract void m1();
}
class B extends A{
void m1(){
System.out.println("B -> m1");
}
}