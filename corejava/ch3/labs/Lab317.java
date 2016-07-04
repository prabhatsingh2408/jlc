class Lab317
{
public static void main(String args[]){

System.out.println("Main :"+ Hello.a);
}
}
class Hello{
static int a=10;
static{
      System.out.println("static block 1 :"+a);
      }
static{
       System.out.println("static block 2 :"+a);
      }
}