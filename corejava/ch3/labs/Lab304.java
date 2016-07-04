class Lab304
{
public static void main(String args[]){
System.out.println("Main :"+Hello.a);
}}
class Hello{
static int a;
static{
a=10;
System.out.println("Initialized :"+a);
}
}