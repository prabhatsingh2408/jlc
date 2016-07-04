package p693;

public class Lab693 {
	public static void main(String[] args) {
int[] arr1 = new int[]{23,45,29,16,5,12};
int[] arr2 = new int[6];
System.out.println("After copying");
System.arraycopy(arr1,0,arr2,0,arr1.length);
	for(int a: arr2){
		System.out.println(a);
	}
}
}
