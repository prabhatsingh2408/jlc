class Lab216
{
public static void main(String as[])
{
char ch='A';
int rows=0;
do{
int cols=0;
do{
System.out.print(ch+"");
cols++;
}while(cols<=rows);
System.out.println();
rows++;
}while (rows<5);
}
}