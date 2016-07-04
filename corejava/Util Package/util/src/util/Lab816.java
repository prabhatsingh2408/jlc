package util;

import java.util.*;
public class Lab816 {
	public static void main(String[] args) {
		System.out.println("**Studant info**");
		TreeSet set =new TreeSet();
        set.add(new Studant(87,"Sri"));
        set.add(new Studant(99,"Dande"));
        set.add(new Studant(12,"SD"));
        set.add(new Studant(45,"Nivas"));
        Iterator it=set.iterator();
        while(it.hasNext())
        System.out.println(it.next());
		}
		}
class Studant implements Comparable{
	int sid;
	String name;
	Studant(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	public int compareTo(Object obj){
		if(obj instanceof Studant){
			Studant st=(Studant) obj;
			return this.sid-st.sid;
		}
		return 0;
	}
	public String toString(){
		return sid + "\t" + name;
	}
}