package com.jlcindia.spring;

import javax.annotation.PostConstruct;

public class B {
	
private int b;       
private String str;  

static{
	System.out.println("B--S.B");
}

public B(){
	System.out.println("B--()");
}

public B(int b, String str){
	System.out.println("B-2arg");
	this.b=b;
	this.str=str;
}

@PostConstruct
public void init(){
	System.out.println("B-init()");
}
public String toString(){
	return ""+b+"\t"+str;
}
}