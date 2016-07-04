class PT10Test19
{
public static void main(String []args){
System.out.println("main " + Hello.b1);

}}
class Hello{
static boolean b1=true;
static{
System.out.println(b1);
System.out.println(Hello.str);
}

static String str="JLC";
static{
System.out.println(b1);
System.out.println(str);
}
}

