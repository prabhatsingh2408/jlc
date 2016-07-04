package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab14 {
public static void main(String[] args) {
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	System.out.println("Spring container is ready");
	System.out.println("--------------------------");
	Hello hello=(Hello)ctx.getBean("hello");
	hello.show();
}
}
