class Lab255
{
public static void main(String args[]){
int arr[]=new int[3];
arr[0]=23; arr[1]=24; arr[2]=25;
int arr2[]=arr;
System.out.println(arr.length);
System.out.println(arr2.length);
arr=new int[5];
System.out.println("LEN : "+arr.length);
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
System.out.println("LEN :"+arr2.length);
for(int i=0;i<arr.length;i++)
System.out.println(arr2[i]);
}
}
