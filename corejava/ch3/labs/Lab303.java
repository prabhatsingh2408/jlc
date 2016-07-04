class Lab303
{
public static void main(String args[]){
Hello h=new Hello();
System.out.println("Main :"+Hello.a);
}}
class Hello{
static int a;
{
a=10;
System.out.println("Initialized :"+a);
}
}