class PT15Test8
{
public static void main(String []args){

A ref=new B();
ref.show(65);
}
}
class A{
static void show (int ab){
System.out.println("A.show -> int" );
}
}
class B extends A{
static void show (int ab){
System.out.println("B.show -> int" );
}
}