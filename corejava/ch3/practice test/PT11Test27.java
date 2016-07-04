class PT11Test27
{
public static void main(String []args){
show((String)null);
}

static void show(String str){
System.out.println("String");
}
static void show(PT11Test27 t){
System.out.println("Test");
}
}