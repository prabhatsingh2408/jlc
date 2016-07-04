package p742;

public class Lab742 {
public static void main(String[] args) {
	System.out.println("Main Started");
	JLCResource res1=null;
	JLCResource res2=null;
	try{
		res1=new JLCResource(1);
		res2=new JLCResource(2);
	}catch(Exception e){
		System.out.println(e);
	}
	finally{
		if(res1!=null)
			res1.close();
		if(res2!=null)
			res2.close();			
	}
	System.out.println("Main Ends");
}
}
class JLCResource implements AutoCloseable{
	int id;
	JLCResource (int id){
		this.id=id;
	}
	public void close(){
		System.out.println("JLCResource closed :" + id);
	}
}