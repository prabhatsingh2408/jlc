package com.jlcindia.listener;
import javax.servlet.http.*;

public class MySessionListener implements HttpSessionListener{
public MySessionListener(){
	System.out.println("**MySessionListener() Der Cons");
}
public void sessionCreated(HttpSessionEvent arg0){
System.out.println("**Session Created");	
}
public void sessionDestroyed(HttpSessionEvent arg0){
	System.out.println("**SessionDestroyed");
}
}
