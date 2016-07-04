package p684;

public class Lab684 {
public static void main(String[] args) {
	Void v=null;
	JlcService.show(null);
	JlcService.show(v);
}
}
class JlcService{
	static void show (Void v){
		System.out.println("show(Void)");
	}
}