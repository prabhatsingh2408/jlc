package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

protected void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
System.out.println("**HelloServlet class-service() started");
Writer out=res.getWriter();
out.write("<h1>Verify the server console");
System.out.println("**HelloServlet class-service() completed");
}
}
