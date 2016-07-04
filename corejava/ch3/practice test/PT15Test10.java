class PT15Test10
{
public static void main(String []args){
A ref=new B();
ref.x="SRI";
System.out.println(ref.x);
}
}
class A{
int x=99;
}
class B extends A{
String x="JLC";
}