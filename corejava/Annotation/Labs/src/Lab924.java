import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Column{
	String name();
	boolean charType() default false;
}

class Faculty{
@Column(name="facultyId",charType=true)
int id;
@Column(name="facultyName")
String name;
long phone;
}
public class Lab924{
public static void main(String[] args) {
	Faculty f1=new Faculty();
	Class cl=f1.getClass();
	Field[] fIds=cl.getDeclaredFields();
	for(Field fId:fIds){
		boolean pre=fId.isAnnotationPresent(Column.class);
		if(pre){
			Column col=(Column)fId.getAnnotation(Column.class);
			String cnm=col.name();
			boolean cty=col.charType();
			System.out.println(fId.getName()+"\t"+cnm+"\t"+cty);
}else{
		System.out.println("For :"+fId.getName()+"\t"+"Column Annotation is not present");
	}
}
}
}