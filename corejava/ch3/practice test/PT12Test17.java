class PT12Test17
{
public static void main(String args []){
B.show();
}}
class A{
static void show()
{
System.out.println("A -> show");
}
}
class B extends A{}