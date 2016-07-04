
class Lab524
{
public static void main(String[] args){
A aobj=new B();
aobj.x=99;
System.out.println(aobj.x);
}
}
class A{
int x=10;
}
class B extends A{
String x="JLC";
}

