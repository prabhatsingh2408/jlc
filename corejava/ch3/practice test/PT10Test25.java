class PT10Test25
{
public static void main(String []args){

System.out.println("main " + Hello.a);
}}
class Hello{
static int a=10;
Hello(){
System.out.println("cons");
}
static{
System.out.println("SB " );
}
static Hello INS=new Hello();
}