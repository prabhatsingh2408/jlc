class PT15Test12
{
public static void main(String []args){
A ref=new A();
ref.m1();

}
}
class A{
abstract void m1(){
System.out.println("A->m1");
}
}