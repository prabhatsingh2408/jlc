package p688;

public class Lab688 {
public static void main(String[] args) {
	JlcService serv = new JlcService();
	byte b1=12;
	byte b2=23;
	serv.show(b1,b2);
}
}
   class JlcService{
	   void show(byte...ab){
		   System.out.println("\n--show(byte...)");
	   }
   }
