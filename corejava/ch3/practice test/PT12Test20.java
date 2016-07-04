class PT12Test20
{
public static void main(String args []){
B ref =new B();
ref.x=99;
ref.show();
}}
class A{int x=10;}
class B extends A{
void show(){
A ref=new A();
System.out.println(ref.x);
}
}