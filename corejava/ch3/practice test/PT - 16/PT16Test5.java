class A{
static void show(){
B ref = new A().new B();
System.out.println(ref.xy);
}

class B {
int xy=99;
}
}

class PT16Test5
{
public static void main(String [] args){
new A().show();
}
}