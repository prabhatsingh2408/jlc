package p899;

public class Lab899 {
	public static void main(String[] args) {
		String className="p899.Hello";
		try{
			Class cls=Class.forName(className);
			System.out.println("class loaded successfully");
			System.out.println("Class Name :"+cls.getName());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	}