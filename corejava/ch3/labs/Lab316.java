class Lab316
{
public static void main(String args[]){
Hello h = new Hello();
System.out.println("Main :"+ Hello.a);
}
}
class Hello{
int a=10;
{
System.out.println("Instance block 1 :"+a);
}
{
System.out.println("Instance block 2 :"+a);
}
}