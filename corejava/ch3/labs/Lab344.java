class Lab344
{
public static void main(String args[]){

Hello h= new Hello(99);
h.show();
}
}
class Hello{
int a;
Hello(){
System.out.println("HELLO DC");
}
Hello(int a){
this();
System.out.println("Hello 1-arg constructor");
this.a=a;
}
void show(){
System.out.println(a);
}
}