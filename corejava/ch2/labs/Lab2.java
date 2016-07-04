class Hello
{
char ch;
void show()
{
System.out.println(ch==0);
System.out.println(ch);
System.out.println(ch==' ');
System.out.println(ch=='\u0000');
}
}
class Lab2{
public static void main(String[] args)
{
Hello h= new Hello();
h.show();
}}