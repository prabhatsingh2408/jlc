package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
public static void main(String[] args) {
/*	
	//Without IOC
	A aobj=new A();
	aobj.setA(99);
	aobj.setMsg("HelloGuys");
	B bobj=new B(88,"Hai Guys");
	Hello hello=new Hello(bobj);
	hello.setAobj(aobj);
	//hello.show();
	*/
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	System.out.println("Spring container is ready");
	System.out.println("--------------------------");
	Hello h=(Hello)ctx.getBean("hello");
	h.show();
}
}
