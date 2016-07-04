interface inter1{
void m1();
void m2();
int A=10;
int B=20;
}
interface inter2{
void m2();
void m3();
int A=11;
int C=30;
}

class Hello implements inter1,inter2{
public void m1(){
System.out.println("Hello-> m1()");
}
public void m2(){
System.out.println("Hello-> m2()");
}
public void m3(){
System.out.println("Hello-> m3()");
System.out.println(B);
System.out.println(C);
}
}

class Lab547{
public static void main(String []args){
Hello h=new Hello();
h.m1();
h.m2();
h.m3();
}
}

