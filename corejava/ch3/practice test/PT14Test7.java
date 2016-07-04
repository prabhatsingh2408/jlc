
class PT14Test7
{
public static void main(String [] args){
B ob=new B();
((A)ob).x=99;
System.out.println(ob.x);
}
}
class A{int x=10;}
class B extends A{
String x="JLC";
}