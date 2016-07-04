package com.jlcindia.listener;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestListener implements ServletRequestListener{
public MyRequestListener(){
	System.out.println("**MySessionListener() Def Cons");
}
public void requestDestroyed(ServletRequestEvent arg0){
	System.out.println("**Request Destroyed");
}
public void requestInitialized(ServletRequestEvent arg0){
	System.out.println("\n ** request Initialized");
}
}
