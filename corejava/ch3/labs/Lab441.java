class Lab441
{
public static void main(String[] args){
Hello h=new Hello();
h.show();
}
}
class Hai{}
class Hello extends Hai {
int a=20;
void show(){
int a=30;
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
}

