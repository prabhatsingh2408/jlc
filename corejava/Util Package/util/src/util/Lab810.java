package util;

import java.util.*;
public class Lab810 {
	public static void main(String[] args) {
		LinkedHashSet set =new LinkedHashSet();
        set.add(new Students(99));
        set.add(new Students(99));
        set.add(new Students(99));
        set.add(new Students(99));
       	System.out.println(set);
		}
		}
class Students{
	int sid;
	Students(int sid){
		this.sid=sid;
	}
	public String toString(){
		return""+sid;
	}
	public int hashCode(){
		System.out.println("****HashCode()****");
		return sid;
	}
	public boolean equals(Object obj){
		System.out.println("****equals****");
		if(obj instanceof Students){
			Students st=(Students)obj;
			return this.sid==st.sid;
		}
		return false;
	}
}