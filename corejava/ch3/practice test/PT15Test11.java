class PT15Test11
{
public static void main(String []args){
A ref=new B();
ref.x=88;
System.out.println(ref.x);
}
}
class A{
int x=99;
}
class B extends A{
String x="JLC";
}