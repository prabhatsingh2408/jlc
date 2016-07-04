class Lab421
 {
public static void main(String[] args){

Hello hello=new Hello();
hello.m1 ();
hello.m2 ();
}
}
class Hai{
int a=99;
void m1(){
System.out.println("Hai->m1" +a);

}
}
class Hello extends Hai{
int b=88;
void m2(){
System.out.println("Hello->m2" +a);
System.out.println("Hello->m2 " +b);
}
}

