class Lab438
{
public static void main(String[] args){
new C();
}
}
class A{
A(){
System.out.println("A->D.C :" );
}
}
class B extends A {
B(){
System.out.println("B-> D.C :" );
}
}
class C extends B{
C(){
System.out.println("C-> D.C :" );
}
}

