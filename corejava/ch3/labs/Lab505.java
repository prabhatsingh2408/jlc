class Lab505
{
public static void main(String[] args){
new B().m1();

}
}
class A{
native void m1();
void m2(){}
}
class B extends A{
void m1(){}
native void m2();
}
