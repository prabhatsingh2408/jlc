class PT10Test4
{
public static void main(String []args){
Hello h=new Hello(10);
System.out.println(h.a);
}}
class Hello{
int a;
Hello(int a){
System.out.println("Hello cons");
this.a=a;
return;
}
}
