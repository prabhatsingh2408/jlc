class Lab341
{
public static void main(String args[]){

Hello h= new Hello();
h.show();
}
}
class Hello{
int a=10;
static int b=20;
void show(){
String a="JLC";
String b="SD";
System.out.println(a);
System.out.println(this.a);
System.out.println(b);
System.out.println(this.b);
}
}