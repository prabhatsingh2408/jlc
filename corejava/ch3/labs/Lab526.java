
class Lab526
{
public static void main(String[] args){
B bobj=new B();
bobj.show();

}
}
class A{
int x=10;
}
class B extends A{
String x="JLC";
void show(){
B ref1=this;
A ref2=this;
System.out.println(ref1.x +"\t" + ref2.x);
}
}

