class PT12Test33
{
public static void main(String args []){
B ref =new B();
ref.setX(90);
System.out.println(ref.getX());
}}
class A{
int x;
void setX(int x){
this.x=x;
}
int getX(){
return x;
}
}

class B extends A{
String x;
}