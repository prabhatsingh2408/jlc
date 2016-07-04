class PT15Test19
{
public static void main(String []args){
Inter1 in=new A();
in.m1();
}
}
interface Inter1{
void m1();
}
class A implements Inter1{
public void m1(){
System.out.println("A -> m1");
}
}
