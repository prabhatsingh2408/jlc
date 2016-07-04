class Lab182
{
public static void main(String as[])
{
int a=45;
final int X=20;
switch(a){
case 10:
System.out.println("TEN");
case X:
System.out.println("TWENTY");
case 'A':
System.out.println("CHAR-A");
case 10+20+15:
System.out.println("CONSTANT EXPR");
default:
System.out.println("DEFAULT");
}
}}
