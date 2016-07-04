class A{}
class A$B {
int x=10;
}

class PT16Test1
{
public static void main(String [] args){
A$B ref = new A$B();
System.out.println(ref.x);
}
}