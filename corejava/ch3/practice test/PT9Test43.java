class PT9Test43
{ 
public static void main(String []args){

System.out.println(Hi.a);
}}

class Hi{
static int a=10;
static Hi h=new Hi();
{System.out.println("I.B");}
static{System.out.println("S.B");}
}
