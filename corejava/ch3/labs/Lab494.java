class Lab494
{
public static void main(String[] args){
B ob=new B();
ob.show();
ob.SHOW();
}
}
class A{
void show(){
System.out.println("A-> show () ");
}
}
class B extends A {
void SHOW(){
System.out.println("B-> SHOW () ");
}
}
