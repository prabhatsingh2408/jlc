class A{
static int xy=99;

static class B {
static{
System.out.println("B.S.B");
}
}
}

class PT16Test6
{
public static void main(String [] args){
System.out.println(A.xy);
}
}