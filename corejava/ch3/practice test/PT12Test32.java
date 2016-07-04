class PT12Test32
{
public static void main(String args []){
B ref =new B();
ref.setX(90);
System.out.println(ref.x);
}}
class A{
int x;
void setX(int x){
this.x=x;
}
}

class B extends A{
String x;
}