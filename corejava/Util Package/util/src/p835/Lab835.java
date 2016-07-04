package p835;
import java.util.*;

public class Lab835 {
	public static void main(String[] args) {
		ArrayList<String> emails=new ArrayList<String>();
		emails.add("sri@jlc.com");
		emails.add("dk@jlc.com");
		emails.add("mk@jlc.com");
		ArrayList<Long> phones=new ArrayList<Long>();
		phones.add(999999999L);
		phones.add(111111111L);
		phones.add(555555555L);
		LinkedHashMap<String,Long> refs=new LinkedHashMap<String,Long>();
		refs.put("Dande",11111L);
		refs.put("Kumar",55555L);
		refs.put("Ranvir",99999L);
		Student stu=new Student(99,"Srinivas",emails,phones,refs);
		ArrayList<Student> stlist=new ArrayList<Student>();
		stlist.add(stu);
		stlist.add(stu);
		stlist.add(stu);
		stlist.add(stu);
			System.out.println(stlist);
		}
		}
	class Student{
		int sid;
		String name;
		List<String> emails;
		List<Long> phones;
		Map<String,Long> refs;
		public Student(int sid,String name,List<String> emails,List<Long> phones,Map<String,Long> refs){
			this.sid=sid;
			this.name=name;
			this.emails=emails;
			this.phones=phones;
			this.refs=refs;
		}
		public String toString(){
			return "\n" +sid+"\n"+name+"\n"+emails+"\n"+phones+"\n"+refs+"\n";
		}
	    }
