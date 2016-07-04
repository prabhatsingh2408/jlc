class PT10Test34
{
public static void main(String []args){
System.out.println("main " + Hello.a);
}}
class Hello{
static final int a=90;
static{
System.out.println(Hello.a);

}
}