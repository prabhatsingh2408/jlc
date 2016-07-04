package com.jlcindia.spring;

import org.springframework.core.io.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Lab21 {
public static void main(String[] args) {
		
    Resource res=new ClassPathResource("jlcindia.xml");
    BeanFactory factory=new XmlBeanFactory(res);
	
	System.out.println("Spring container is ready");
	System.out.println("--------------------------");
	Hello hello=(Hello)factory.getBean("hello");
	hello.show();
	System.out.println("---------------------");
	System.out.println("Spring container is going to shutdown");
}
}