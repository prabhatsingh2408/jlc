package com.jlcindia.spring;

import javax.annotation.PostConstruct;;

public class A {
	
private int a;    

private String msg;  

static{
	System.out.println("A-S.B");
}

public A(){
System.out.println("A()");	
}

public void setA(int a){
	System.out.println("A-setA()");
	this.a=a;
}

public void setMsg(String msg){
	System.out.println("A-setMsg()");
	this.msg=msg;
}

@PostConstruct
public void init(){
System.out.println("A-init()");	
}

public String toString(){
	return ""+a+"\t"+msg;
}
}