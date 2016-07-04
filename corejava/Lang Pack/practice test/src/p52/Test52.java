package p52;

public class Test52 {
public static void main(String[] args) {
	Hello h=new Hello();
	h.show('A');
}
}
class Hello{
	void Show(char...values){
		System.out.println("CHAR1");
	}
	void show(int ab){
		System.out.println("INT2");
	}
}