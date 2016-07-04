class Lab431
{
public static void main(String[] args){

System.out.println(Hai.a);
}
}
class Hai{
static int a =99;
static{
System.out.println("Hai->S.B :" );
}
}
class Hello extends Hai{

static{
System.out.println("Hello->S.B :" );

}
}
