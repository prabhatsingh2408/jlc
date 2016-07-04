class PT12Test18
{
public static void main(String args []){
B ref =new B();
ref.show();
}}
class A{
int x=10;
}
class B extends A{
boolean x=true;
void show(){
System.out.println(x);
}
}