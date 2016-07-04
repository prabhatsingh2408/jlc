class PT12Test31
{
public static void main(String args []){
B ref =new B();
ref.x="JLC";
System.out.println(ref.x);
}}
class A{
int x;
}

class B extends A{
String x;
}