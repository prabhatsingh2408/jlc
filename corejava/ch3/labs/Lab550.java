

class Hello implements inter1,inter2{
public void m1(){
System.out.println("Hello-> m1()");
}
public void m2(){
System.out.println("Hello-> m2()");
}
public void m3(){
System.out.println("Hello-> m3()");
System.out.println(inter1.A);
System.out.println(inter2.A);
System.out.println(B);
System.out.println(C);
}
}

class Lab550{
public static void main(String []args){
Hello h=new Hello();
inter1 ref1=h;
ref1.m1();
ref1.m2();

inter2 ref2=h;
ref2.m2();
ref2.m3();
}
}

