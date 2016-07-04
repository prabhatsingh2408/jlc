class PT15Test21
{
public static void main(String []args){
A ref1=new A();
ref1.x=80;
System.out.println(ref1.x);
C ref2=new C();
System.out.println(ref2.x);
}
}
interface Inter1{
int x=90;
}
class A implements Inter1{}
class B implements Inter1{}