package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletC extends HttpServlet {

protected void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
System.out.println("**ServletC-service() started");
Writer out=res.getWriter();
out.write("<h2><br/>Verify the server console");
System.out.println("**ServletC service() completed");
}
}