class Lab382
{
public static void main(String args[]){
Hello h=new Hello();
int a=h.add(10,20);
System.out.println(a);
h.add(10,20);
}
}
class Hello{
int add(int a,int b){
System.out.println("add(int,int) " );
return a+b;
}
void add(int a,int b){
System.out.println("add(int,int) " );
}
}