

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

class Lab549{
public static void main(String []args){
Hello h=new Hello();
h.m1();
h.m2();
h.m3();
}
}

