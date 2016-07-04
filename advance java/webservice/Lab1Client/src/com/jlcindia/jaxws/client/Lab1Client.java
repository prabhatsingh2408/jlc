package com.jlcindia.jaxws.client;
import com.jlcindia.jaxws.*;
public class Lab1Client {
public static void main(String[] args) {
	HelloService hs=new HelloService();
	HelloDelegate hello=hs.getHelloPort();
	String msg=hello.getMessage("Srinivas");
	System.out.println(msg);
	msg=hello.getMessage("vas");
	System.out.println(msg);
}
}
