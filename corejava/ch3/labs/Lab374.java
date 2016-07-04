class Lab374
{
public static void main(String args[]){
Hello h=new Hello();
System.out.println(h.show());

}
}
class Hello{
int show(int x){
System.out.println("show() " );
return x+1;

}
}
