class A{
void show(){
B ref = this.new B();
System.out.println(ref.xy);
}

class B {
private int xy=99;
}
}

class PT16Test3
{
public static void main(String [] args){
new A().show();
}
}