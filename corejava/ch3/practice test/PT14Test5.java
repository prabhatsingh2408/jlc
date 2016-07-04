
class PT14Test5
{
public static void main(String [] args){
B ob=new B();
ob.x=99;
System.out.println(ob.x);
}
}
class A{int x=10;}
class B extends A{
String x="JLC";
}