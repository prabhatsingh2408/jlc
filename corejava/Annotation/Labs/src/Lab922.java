import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface JLCCloneable{}

@JLCCloneable
class Emp{
	int eid;
	String ename;
	Emp(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	@Override
	public String toString(){
		return eid +"\t" + ename;
	}
	public Emp getClonedObject()throws CloneNotSupportedException{
		boolean b1=this.getClass().isAnnotationPresent(JLCCloneable.class);
		if(b1){
			return new Emp(this.eid,this.ename);
		}
		throw new CloneNotSupportedException("Emp class not using JLCCloneable");
	}
}

public class Lab922 {
public static void main(String[] args) throws CloneNotSupportedException{
Emp emp=new Emp(99,"Srinivas");
System.out.println(emp);
Emp emp2=emp.getClonedObject();
System.out.println(emp2);
System.out.println(emp==emp2);
}
}
