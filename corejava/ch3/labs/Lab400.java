class Lab400
{
public static void main(String args[]){
Hello h=new Hello();
h.sum(12,23);
h.sum(12,23,35);
}
}
class Hello{
void sum(int a,int b){
System.out.println("---sum(int,int)" );
System.out.println(a+b);
}

void sum(int a,int b,int c){
System.out.println("---sum(int,int,int)" );
System.out.println(a+b+c);
}
}
