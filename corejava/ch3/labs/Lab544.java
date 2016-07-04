interface inter1{
void m1();
public abstract void m2();
int A=10;
public final int B=20;
}

class Hello implements inter1{
public void m1(){
System.out.println("Hello-> m1()" + A);
}
public void m2(){
System.out.println("Hello-> m2()" + B);
}
}

class Lab544{
public static void main(String []args){
inter1 ref=null;
//ref=new inter1();
ref=new Hello();
ref.m1();
ref.m2();
}
}

