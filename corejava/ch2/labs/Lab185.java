class Lab185
{
public static void main(String as[])
{
char ch='A';
if(ch>=65 && ch<=90)
{
switch(ch)
{
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("Character is Vowel");
break;
default:
System.out.println("Character is CONSONENT");
}
}
else
{
System.out.println("Invalid Alphabet");
}
}
}
