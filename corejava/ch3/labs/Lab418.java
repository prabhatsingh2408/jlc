class Lab418
 {
public static void main(String[] args){
Hai hai=new Hai();
System.out.println(hai.a );
System.out.println(hai.b );

Hello hello=new Hello();
System.out.println(hello.a );
System.out.println(hello.b );
}
}
class Hai{
int a=99;
}

class Hello extends Hai{
int b=88;
}

