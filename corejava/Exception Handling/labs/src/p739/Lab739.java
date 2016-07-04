
package p739;

public class Lab739 {
	public static void main(String[] args) {
		System.out.println("Main started");
		try{
			StudentService serv=new StudentService();
			serv.getNameBySid(null
					);
				}
		catch(Exception e){
			e.printStackTrace();
		}
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