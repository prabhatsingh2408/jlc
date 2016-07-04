class Lab405
{
public static void main(String args[]){
Hello h1=new Hello();
h1.m1();
}
}
class Hello{
void m1(int...a){
System.out.println("\n m1 (int...)" );
}
void m1(String...a){
System.out.println("\n m1 (String...)" );
}
}
