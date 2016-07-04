class Lab449
{
public static void main(String[] args){
B bobj=new B(10,"JLC");
bobj.show();
}
}
class A{
int a;
A(int a){
System.out.println("A(int)cons");
this.a=a;
}
}
class B extends A {
String a;
B(int a1,String a2){
super(a1);
this.a=a2;
System.out.println("B(int)cons");
}
void show(){
System.out.println(this.a);
System.out.println(super.a);
}
}
