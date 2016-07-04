package com.jlcindia.listener;
import javax.servlet.*;

public class MyContextListener implements ServletContextListener{

public void contextDestroyed(ServletContextEvent event){
	System.out.println("**context Destroyed :");
}
public void contextInitialized(ServletContextEvent event){
	
	System.out.println("**context Initialized :");
	ServletContext ctx=event.getServletContext();
	ctx.setAttribute("TV", 0);
	ctx.setAttribute("TA", 0);
}
}
