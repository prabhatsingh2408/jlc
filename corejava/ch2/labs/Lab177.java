class Lab177
{
public static void main(String as[])
{
Course c=Course.CORE;
switch(c){
case ADV:
System.out.println("100% PLACEMENT GURANTEE");
case CORE:
System.out.println("NO PLACEMENT GURANTEE");
}
}}
enum Course{
CORE,ADV;
}