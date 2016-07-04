class Lab391
{
public static void main(String args[]){
Hello h=new Hello();

h.show("JLC");
h.show(h);
}
}
class Hello{
void show(String str){
System.out.println("show(String)");
}
void show(Hello str){
System.out.println("show(Hello)" );
}
}