class Lab309
{
public static void main(String args[]){
System.out.println("Main :"+Hello.a);
}}
class Hello{
static int a;
int b;
static{
a=10;
b=20;
System.out.println("Static Block");
}
}