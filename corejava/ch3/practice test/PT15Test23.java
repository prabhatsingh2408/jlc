class PT15Test23
{
public static void main(String []args){
Inter1 in1=new A();
in1.m1();
Inter2 in2=new A();
in2.m2();
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
