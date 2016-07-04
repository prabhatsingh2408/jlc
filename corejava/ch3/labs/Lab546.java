interface inter1{
void m1();
int A=10;
}
interface inter2{
void m2();
int B=11;
}

class Hello implements inter1,inter2{
public void m1(){
System.out.println("Hello-> m1()");
}
public void m2(){
System.out.println("Hello-> m2()");
}
}

class Lab546{
public static void main(String []args){
Hello h=new Hello();
System.out.println(h.A);
System.out.println(h.B);
h.m1();
h.m2();
}
}

