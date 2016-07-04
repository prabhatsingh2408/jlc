
class PT14Test6
{
public static void main(String [] args){
B ob=new B();
ob.x="HELLO";
System.out.println(ob.x);
}
}
class A{int x=10;}
class B extends A{
String x="JLC";
}