class Lab386
{
public static void main(String args[]){
Hello h=new Hello();
byte b=20;
h.add(10,b);
h.add(b,b);
}
}

class Hello{
void add(int a,byte b){
System.out.println("add(int,byte) " );

}
}