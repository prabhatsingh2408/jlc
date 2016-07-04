class PT10Test31
{
public static void main(String []args){
System.out.println("main " + new Hello().a);

}}
class Hello{
final int a;

Hello(){a=90;
System.out.println(this.a);

}
}