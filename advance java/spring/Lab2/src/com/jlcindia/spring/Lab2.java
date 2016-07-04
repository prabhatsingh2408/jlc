package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2 {
public static void main(String[] args) {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
	System.out.println("Spring container is ready");
	System.out.println("--------------------------");
	Customer cust=(Customer)ctx.getBean("cust");
	//cust.show();
}
}
