class PT15Test22
{
public static void main(String []args){
Inter1 in=new A();
in.m1();
in.m2();
}
}
interface Inter1{
void m1();
}
interface Inter2{
void m2();
}
class A implements Inter1,Inter2{
public void m1(){
System.out.println("A->m1");
}
public void m2(){
System.out.println("A->m2");
}
}
