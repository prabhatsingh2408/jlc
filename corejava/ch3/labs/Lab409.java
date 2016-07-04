class Lab409
{
public static void main(String args[]){
Hello h=new Hello();
h.show();
int arr1[]=new int[]{10};
int arr2[]=new int[]{10,30,12};
h.show(arr1,arr2);
}
}
class Hello{
void show(int[]...arr1){
System.out.println("\n m1 (int[]...)" );
}
}
