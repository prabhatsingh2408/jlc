package com.jlcindia.spring;

public class Hello {

	private A aobj;    
	private B bobj;    
	
	public Hello(){
		System.out.println("Hello-()");
		}
	
	public void Hello(A bobj){
		System.out.println("Hello-(A)");
		this.aobj=aobj;
	}
	
	public void Hello(B bobj){
		System.out.println("Hello-(B)");
		this.bobj=bobj;
	}
	
	public void Hello(A aobj,B bobj){
		System.out.println("Hello-(B)");
		this.bobj=bobj;
		this.aobj=aobj;
	}
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}