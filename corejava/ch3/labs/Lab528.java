
class Lab528
{
public static void main(String[] args){
C cobj=new C();
cobj.show();
cobj.x=true;
B bref = cobj;
bref.x="SRI";
A aref = cobj;
aref.x=88;
cobj.show();
}
}
class A{
int x=99;
}
class B extends A{
String x="JLC";
}
class C extends B{
boolean x=false;
void show(){
char x='J';
System.out.println(x);
C cref=this;
B bref=this;
A aref=this;
System.out.println(cref.x);
System.out.println(bref.x);
System.out.println(aref.x);
}
}

