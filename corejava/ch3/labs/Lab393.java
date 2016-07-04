class Lab393
{
public static void main(String args[]){
int x=10;
System.out.println("main begins :" +x);
new A().m1(x+10);
System.out.println("main ends :" + x);
}
}
class A{
void m1(int x){
System.out.println("m1 begins :" + x);
new B().m2(x+10);
System.out.println("m1 ends :" + x);
}
}
class B{
void m2(int x){
System.out.println("m2 begins :" + x);
new C().m3(x+10);
System.out.println("m2 ends :" + x);
}
}
class C{
void m3(int x){
System.out.println("m3 begins :" + x);
System.out.println("m3 ends :" + x);
}
}