class Lab326
{
public static void main(String args[]){

System.out.println(" I am main()");
{
int a=10;
System.out.println(" I am local block in main() :"+ a);
}
{
int a=20;
System.out.println(" I am local block 2 in main():"+a);

}
{
String a="jlc";
System.out.println(" I am local block 3 in main():"+a);
}
}
}