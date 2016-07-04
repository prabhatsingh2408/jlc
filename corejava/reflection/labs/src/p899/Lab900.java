package p899;

public class Lab900 {
public static void main(String[] args) {
	showClassInfo("OK");
	//showClassInfo(new Lab1365());
	Hello h=new Hello();
	showClassInfo(h);
}
static void showClassInfo(Object obj){
	Class cls=obj.getClass();
	System.out.println("\nClass Name :"+cls.getName());
}
}
class Hello{}