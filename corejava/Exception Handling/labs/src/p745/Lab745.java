package p745;

public class Lab745 {
public static void main(String[] args) {
	System.out.println("Main Started");
	try(
			JLCResource res1=new JLCResource(1);
			JLCResource res2 =new JLCResource(2);
			)
			{
		//stetements
			}catch(Exception e){
				System.out.println(e);
			}
	System.out.println("Main Ends");
}
}
class JLCResource{
	int id;
	JLCResource(int id){
		this.id=id;
	}
	public void close(){
		System.out.println("JLCResource closed :"+ id);
	}
}