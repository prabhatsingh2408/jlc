class A{
void show(){
B ref = new B();
System.out.println("OK");
}

class B {
private B(){}
}
}

class PT16Test2
{
public static void main(String [] args){
new A().show();
}
}