
class Lab525
{
public static void main(String[] args){
B bobj=new B();
bobj.show();

}
}
class A{
int x=10;
}
class B extends A{
String x="JLC";
void show(){
System.out.println(x);
System.out.println(super.x);
}
}

