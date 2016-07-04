class Lab445
{
public static void main(String[] args){
new B();
}
}
class A{
A(int a){
System.out.println("A (int) cons");
}
}
class B extends A {
B(){
super();
System.out.println("B->D.C");
}
}

