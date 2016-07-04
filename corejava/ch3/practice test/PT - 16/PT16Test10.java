class A{
static int x=99;

static class B {
static int x=88;
void show(){
System.out.println(x);
System.out.println(A.x);
}
}
}

class PT16Test10
{
public static void main(String [] args){
A.B ref = new A.B();
ref.show();
}
}