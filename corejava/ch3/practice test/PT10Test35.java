class PT10Test35
{
public static void main(String []args){
System.out.println("main " + Hello.a);
}}
class Hello{
static final int a;
static{
a=90;
System.out.println(Hello.a);

}
}