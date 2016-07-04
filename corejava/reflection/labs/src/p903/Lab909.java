package p903;

public class Lab909 {
public static void main(String[] args) {
	try{
	String cname="p903.User";
	Class cl=Class.forName(cname);
	Object obj=cl.newInstance();
	System.out.println(obj);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
class User{
	User(){
	System.out.println("\n**User DEf Cons**");
	}
}