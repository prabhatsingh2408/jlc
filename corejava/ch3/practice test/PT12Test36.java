class PT12Test36
{
public static void main(String args []){
B r1 =new B();
B r2 =new B();
r1.x=99;
r2.x=88;
r1.show();
r2.show();
}}
class A{
static int x;
}

class B extends A{
void show(){
System.out.println(super.x);
}
}