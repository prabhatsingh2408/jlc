package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {

	@Autowired
	private A aobj;
	
	@Autowired
	private B bobj;    
	
//	public void setAobj(A aobj){
//		System.out.println("Hello-setAobj");
//		this.aobj=aobj;
//	}
//	public void setBobj(B bobj){
//		System.out.println("Hello-1-arg");
//		this.bobj=bobj;
//	}
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}