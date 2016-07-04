class PT11Test36
{
static int count =0;
public static void main(String...args){
System.out.println("MAIN" );
count++;
if(count==1)
main();
}
}