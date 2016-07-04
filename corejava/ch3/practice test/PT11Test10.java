class PT11Test10
{
public static void main(String []args){
int i=0;
for(System.out.println("BEGIN");Hello.process(i);i++,System.out.println("UPDATE"));
System.out.println(i);
}
}
class Hello{
static boolean process(int x){
System.out.println("CONDITION");
if(x<1)return true;
else
return false;
}
}