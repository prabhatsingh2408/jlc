class PT10Test30
{
public static void main(String []args){
System.out.println("main " + new Hello().a);

}}
class Hello{
final int a;

Hello(){
System.out.println(this.a);
a=90;
}
}