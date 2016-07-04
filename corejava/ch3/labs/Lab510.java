class Lab510
{
public static void main(String[] args){
new B().m1();

}
}
class A{
protected void m1(){}
protected void m2(){}

}
class B extends A{
public void m1(){}
protected void m2(){}

}


