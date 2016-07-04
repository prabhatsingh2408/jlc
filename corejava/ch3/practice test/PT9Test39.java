class PT9Test39
{ 
public static void main(String []args){
System.out.println("main :"+Hello.b);
}}
class Hello{
static{
System.out.println(Hello.b);
}
static int b=20;
static{System.out.println(b);
}
}