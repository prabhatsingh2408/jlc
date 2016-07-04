class Lab384
{
public static void main(String args[]){
Hello h=new Hello();
int a=h.add(10,20);
System.out.println(a);
String b=h.add("JLC",99);
System.out.println(b);
}
}
class Hello{
int add(int a,int b){
System.out.println("add(int,int) " );
return a+b;
}
String add(String a,int b){
System.out.println("add(String,int) " );
return a+b;
}
}