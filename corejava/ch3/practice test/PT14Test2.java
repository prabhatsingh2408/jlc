class PT14Test2
{
public static void main(String []args){
Hello h=new Hello(99);
System.out.println(h.getX());
}
}
class Hello{
private int x;
Hello(int x){
this.x=x;
}
int getX(){
return this.x;
}
}
