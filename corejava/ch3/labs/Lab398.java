class Lab398
{
public static void main(String args[]){
Hai hai=new Hai();
hai.a=99;
Hello hello=new Hello();
System.out.println("main begins :" + hai.a);
hello.m1(hai);
System.out.println("main ends :" + hai.a);
}
}
class Hello{
void m1(Hai hai){
System.out.println("m1 begins :" + hai.a);
hai=new Hai();
hai.a=hai.a+10;
System.out.println("m1 ends :" + hai.a);
}
}
class Hai{
int a;
}