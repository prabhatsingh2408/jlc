class Lab419
 {
public static void main(String[] args){
Hai hai=new Hai();
System.out.println(hai.a );

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

