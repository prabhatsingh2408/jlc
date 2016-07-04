class PT10Test27
{
public static void main(String []args){
System.out.println("main " + new Hello().a);
System.out.println("main " + new Hello().b);
}}
class Hello{
final int a;
int b;
Hello(){
a=10;
b=20;
}
Hello(int b){this.b=b;}
}