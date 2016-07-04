class PT15Test7
{
public static void main(String []args){

A ref=new B();
ref.show(65);
}
}
class A{
void show (int ab){
System.out.println("A.show -> int" );
}
}
class B extends A{
void show (int ab){
System.out.println("B.show -> int" );
}
}