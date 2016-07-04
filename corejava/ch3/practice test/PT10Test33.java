class PT10Test33
{
public static void main(String []args){
System.out.println("main " + new Hello().a);
}}
class Hello{
static final int a;
static{
System.out.println(Hello.a);
a=90;
}
}