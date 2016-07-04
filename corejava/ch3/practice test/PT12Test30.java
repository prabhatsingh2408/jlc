class PT12Test30
{
public static void main(String args []){
B ref =new B();
ref.x=90;
System.out.println(ref.x);
}}
class A{
int x;
}

class B extends A{
String x;
}