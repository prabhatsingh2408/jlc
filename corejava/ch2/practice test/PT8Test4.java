class PT8Test4
{
public static void main(String []args)
{
int a=1;
int arr[]=new int[2];
arr[a=a++]=20;
System.out.println(arr[0]+","+arr[1]);
}
}