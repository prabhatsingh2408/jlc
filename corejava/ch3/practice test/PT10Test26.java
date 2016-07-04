class PT10Test26
{
public static void main(String []args){

System.out.println("main " + Hello.a);
}}
class Hello{
static int a=10;
Hello(){
System.out.println("cons");
}
static Hello INS=new Hello();
static{
System.out.println("SB " );
}

}