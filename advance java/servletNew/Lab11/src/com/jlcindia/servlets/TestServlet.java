package com.jlcindia.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet extends HttpServlet{
	static int count=0;
protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
	count++;
System.out.println("--service-- :"+count);
Writer out=res.getWriter();
Date dt=new Date();
out.write("<h1>"+dt);
if(count<=10){
	res.setHeader("Refresh","3");
}
else{
	res.setHeader("Refresh","5;URL=http://jlcindia.com");
}
}
}