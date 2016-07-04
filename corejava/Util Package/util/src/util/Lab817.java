package util;

import java.util.*;
public class Lab817 {
	public static void main(String[] args) {
		System.out.println("\n\n**Employe info**");
		TreeSet set =new TreeSet();
        set.add(new Employe(87,"Sri"));
        set.add(new Employe(99,"Dande"));
        set.add(new Employe(12,"SD"));
        set.add(new Employe(45,"Nivas"));
        Iterator it=set.iterator();
        while(it.hasNext())
        System.out.println(it.next());
		}
		}
class Employe implements Comparable{
	int eid;
	String name;
	Employe(int eid,String name){
		this.eid=eid;
		this.name=name;
	}
	public int compareTo(Object obj){
		if(obj instanceof Employe){
			Employe em=(Employe) obj;
			return this.name.compareTo(em.name);
		}
		return 0;
	}
	public String toString(){
		return eid + "\t" + name;
	}
}