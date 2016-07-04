package com.jlcindia.jaxws;

public class Hello {
public String getMessage(String name){
	String msg="Hello "+name+" Welcome to WebServices world using JAX-WS Metro";
	System.out.println(msg);
	return msg;
}
}
