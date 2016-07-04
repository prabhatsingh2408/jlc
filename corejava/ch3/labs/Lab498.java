class Lab498
{
public static void main(String[] args){
Hai hai=new Hai();
hai.m1();

}
}
class Hello{
A m1(){
return new A();
}
}
class Hai extends Hello {
A m1(){
return new A();
}
}
class A{}
class B extends A{}