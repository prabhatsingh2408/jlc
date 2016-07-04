class A{
int x=99;

class B {
int y=88;
}
}

class PT16Test8
{
public static void main(String [] args){
A.B ref = new A().new B();
System.out.println(ref.x);
System.out.println(ref.y);
}
}