class Lab385
{
public static void main(String args[]){
Hello h=new Hello();
String a=h.add(99,"JLC");
System.out.println(a);
String b=h.add("JLC",99);
System.out.println(b);
}
}
class Hello{
String add(int a,String b){
System.out.println("add(int,String) " );
return a+b;
}
String add(String a,int b){
System.out.println("add(String,int) " );
return a+b;
}
}