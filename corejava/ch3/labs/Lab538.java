
abstract class Hello
{
 int a;
Hello(int a){
this.a=a;
System.out.println("Hello(int) cons");
}
{System.out.println("Hello-> I.B");}
void show(){
System.out.println("Hello-> show");
}
}
class Hai extends Hello{
Hai(int a){
super(a);
}
}
class Lab538{
public static void main(String []args){
Hai hai=new Hai(10);
hai.show();
}
}

