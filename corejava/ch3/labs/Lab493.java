class Lab493
{
public static void main(String[] args){
Hai hai=new Hai();
hai.m1();
hai.m2();
hai.m3();
}
}
class Hello{
void m1(){
System.out.println("Hello-> m1()");
}
void m2(){
System.out.println("Hello-> m2()");
}
}
class Hai extends Hello {
void m2(){
System.out.println("Hello-> m2()");
}
void m3(){
System.out.println("Hello-> m3()");

}
}
