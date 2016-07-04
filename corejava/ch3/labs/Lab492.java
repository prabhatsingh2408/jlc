
class Lab492{
public static void main(String[] args){
B oa=new B(99);

System.out.println(oa.getX());
}
}
class A{
private int x;
A(int x){
this.x=x;
}
int getX(){
return this.x;
}
}
class B extends A{
B(int x){
super(x);
}}