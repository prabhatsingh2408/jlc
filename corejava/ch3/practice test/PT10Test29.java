class PT10Test29
{
public static void main(String []args){
System.out.println("main " + new Hello(99).a);
System.out.println("main " + new Hello(88).b);
}}
class Hello{
final int a;
int b;
Hello(){
a=10;
b=20;
}
Hello(int b){
this.a=b;
this.b=b;
}
}