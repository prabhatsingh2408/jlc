class Lab371
{
public static void main(String args[]){
Hello h=new Hello();

System.out.println(h.show(10));
}
}
class Hello{
boolean show(int x){
System.out.println("show()");
return false;
}
}
