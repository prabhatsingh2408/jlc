class PT10Test15
{
public static void main(String []args){
System.out.println("main " + Hello.a);

}}
class Hello{
static{
System.out.println("s.b  " + Hello.a);
}
static int a=90;
static{
System.out.println("S.B  " + a);
}
}

