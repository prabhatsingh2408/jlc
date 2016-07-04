package com.jlcindia.spring;

public class Hello {

	private A aobj;    //Setter injection
	private B bobj;    //Contructor injection
	
	public void setAobj(A aobj){
		System.out.println("Hello-setAobj");
		this.aobj=aobj;
	}
	public Hello(B bobj){
		System.out.println("Hello-1-arg");
		this.bobj=bobj;
	}
	
	public void show(){
		aobj.showA();
		bobj.showB();
	}
}