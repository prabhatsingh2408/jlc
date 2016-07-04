
class Lab527
{
public static void main(String[] args){
B bobj=new B();
bobj.x="SRI";
A aobj= bobj;
aobj.x=88;
bobj.show();
}
}
class A{
int x=10;
}
class B extends A{
String x="JLC";
void show(){
System.out.println(x);
System.out.println(super.x);
}
}

