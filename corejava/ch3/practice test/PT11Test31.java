class PT11Test31
{
static int a;
public static void main(String []args){
int a=10;
show(a);
System.out.println(PT11Test31.a + "\t" +a );
}

static void show(int a){
a=a+20;
PT11Test31.a=a;
}
}