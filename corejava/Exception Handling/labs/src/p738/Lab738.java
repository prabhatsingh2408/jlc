package p738;

public class Lab738 {
public static void main(String[] args) {
	System.out.println("Main started");
	try{
		StudentService serv=new StudentService();
		serv.getNameBySid(null);
			}
	catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("Main ends");
}
}
class StudentService{
	String getNameBySid(String sid){
		if(sid==null ||sid.isEmpty() || !sid.equals("JLC-99"))
			throw new StudentNotFoundException(sid);
		else
			return "srinivas";
	}
}
class StudentNotFoundException extends RuntimeException{
	StudentNotFoundException(String sid){
		super(sid);
	}
}