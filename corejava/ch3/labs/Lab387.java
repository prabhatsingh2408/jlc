class Lab387
{
public static void main(String args[]){
Hello h=new Hello();
byte b=20;
h.add(b,10);
h.add(b,b);
}
}

class Hello{
void add(byte b,int a){
System.out.println("add(byte,int) " );

}
}