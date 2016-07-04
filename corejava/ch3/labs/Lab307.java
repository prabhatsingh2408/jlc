class Lab307
{
public static void main(String args[]){
Hello h=null;
System.out.println("Ref Created");
h=new Hello();
}}
class Hello{

{System.out.println("Instance Block");
}
static{
System.out.println("Static Block");
}
}