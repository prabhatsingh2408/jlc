class PT15Test6
{
public static void main(String []args){

A ref=new A();
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