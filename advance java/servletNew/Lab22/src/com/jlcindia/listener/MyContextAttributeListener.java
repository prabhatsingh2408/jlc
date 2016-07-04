	package com.jlcindia.listener;
	import javax.servlet.*;
    import javax.servlet.annotation.WebListener;
	
	@WebListener
	public class MyContextAttributeListener implements ServletContextAttributeListener{
	public MyContextAttributeListener(){
	System.out.println("MyContextAttributeListener Der Cons()");
	}
	public void attributeAdded(ServletContextAttributeEvent event){
		String nm=event.getName();
		String val=event.getValue().toString();
		System.out.println("**Attribute Added :"+"\t"+nm+"\t"+val);
	}
	public void attributeRemoved(ServletContextAttributeEvent event){
		String nm=event.getName();
		String val=event.getValue().toString();
		System.out.println("**Attribute Removed :"+"\t"+nm+"\t"+val);
	}
	public void attributeReplaced(ServletContextAttributeEvent event){
		String nm=event.getName();
		String val=event.getValue().toString();
		System.out.println("**Attribute Replaced :"+"\t"+nm+"\t"+val);
}
	}