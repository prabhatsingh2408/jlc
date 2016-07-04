class Lab495
{
public static void main(String[] args){
B ob=new B();
ob.show(99);
ob.show("JLC");
}
}
class A{
void show(int ab){
System.out.println("A-> show (int) ");
}
}
class B extends A {
void show(String ab){
System.out.println("B-> show (String) ");
}
}
