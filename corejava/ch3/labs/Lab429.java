class Lab429
{
public static void main(String[] args){

new Hello();
}
}
class Hai{
static int a=99;
static{
System.out.println("Hai->S.B :" +a);
}
}
class Hello extends Hai{
static int b =88;
static{
System.out.println("Hello->S.B :" +a);
System.out.println("Hello->S.B :" +b);
}
}
