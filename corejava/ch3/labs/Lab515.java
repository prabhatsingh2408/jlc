class Lab515
{
public static void main(String[] args){
B ob=new B();
ob.m1();

}
}
class A{
static void m1(){
System.out.println("A-> m1");
}
}
class B extends A{
static void m1(){
System.out.println("B-> m1");

}
}


