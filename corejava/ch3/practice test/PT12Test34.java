class PT12Test34
{
public static void main(String args []){
B ref =new B();
ref.setX("JLC");
System.out.println(ref.getX());
}}
class A{
int x;

int getX(){
return x;
}
}

class B extends A{
String x;
void setX(String x){
this.x=x;
}
}