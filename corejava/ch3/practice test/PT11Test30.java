class PT11Test30
{
public static void main(String []args){
show((Object)null);
}

static void show(String str){
System.out.println("String");
}
static void show(PT11Test30 t){
System.out.println("Test");
}
}