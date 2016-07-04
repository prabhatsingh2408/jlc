package com.jlcindia.listener;
import javax.servlet.*;

public class MyContextListener implements ServletContextListener{
public MyContextListener(){
	System.out.println("MyContextListener Der Cons()");
}
public void contextDestroyed(ServletContextEvent event){
	ServletContext ctx=event.getServletContext();
	System.out.println("**context Destroyed :"+ctx);
}
public void contextInitialized(ServletContextEvent event){
	ServletContext ctx=event.getServletContext();
	System.out.println("**context Initialized :"+ctx);
}
}
