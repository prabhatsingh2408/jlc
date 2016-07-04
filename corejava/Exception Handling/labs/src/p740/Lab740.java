package p740;

public class Lab740 {
	public static void main(String[] args) throws StudentNotFoundException {
		System.out.println("Main started");
		StudentService serv=new StudentService();
		serv.getNameBySid("JLC-99");
		System.out.println("Main ends");
	}
	}
	class StudentService{
		String getNameBySid(String sid)throws StudentNotFoundException{
			if(sid==null ||sid.isEmpty() || !sid.equals("JLC-99"))
				throw new StudentNotFoundException(sid);
			else
				return "srinivas";
		}
	}
	class StudentNotFoundException extends Exception{
		StudentNotFoundException(String sid){
			super(sid);
}
}

