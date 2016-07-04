class PT10Test32
{
public static void main(String []args){
System.out.println("main " + new Hello().a);
}}
class Hello{
static final int a;
Hello(){
System.out.println(Hello.a);
}
}