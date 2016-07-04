class Lab436
{
public static void main(String[] args){
Hello.show();
}
}
class Hai{
static void show(){
System.out.println("Hai->show :" );
}
static{
System.out.println("Hai->S.B :" );
}
}
class Hello extends Hai {
static{
System.out.println("Hello->S.B :" );
}
}

