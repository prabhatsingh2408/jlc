

public class Test14 {
public static void main(String[] args) {
	int x;
	try{
		x=99;
               int y=99/0;
	}catch(Exception e){
		x=0;
	}
	System.out.println(x);
}
}
