class PT11Test38
{
static int count =0;
public static void main(String...args){
System.out.println("MAIN"+ args.length );
count++;
if(count==1)
main("SRI");
}
static void main(String str){
System.out.println("MAIN");
}
}