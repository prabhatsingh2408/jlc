interface inter1{
void m1();
public abstract void m2();
int A=10;
public final int B=20;
}
abstract class Hello implements inter1{
public void m1(){
System.out.println("Hello-> m1()" + A);
}
}
class Hai extends Hello{
public void m2(){
System.out.println("Hai-> m2()" + B);
}
 void m3(){
System.out.println("Hai-> m3()" + B);
}
}

class Lab545{
public static void main(String []args){
inter1 ref=new Hai();
//ref.m3();
ref.m1();
ref.m2();
}
}

