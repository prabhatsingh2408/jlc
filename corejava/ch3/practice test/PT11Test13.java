class PT11Test13
{
public static void main(String []args){
if(m2() & m1())
System.out.println("IF");
else
System.out.println("ELSE");
}

static boolean m1(){
System.out.println("m1");
return true;
}
static boolean m2(){
System.out.println("m2");
return false;
}
}