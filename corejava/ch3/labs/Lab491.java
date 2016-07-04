
class Lab491{
public static void main(String[] args){
A oa=new A();
oa.setX(99);
System.out.println(oa.getX());
}
}
class A{
private int x;
public void setX(int x){
this.x=x;
}
public int getX(){
return this.x;
}
}
