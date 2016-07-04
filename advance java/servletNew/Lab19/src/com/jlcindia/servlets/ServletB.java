package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletB extends HttpServlet {

protected void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
System.out.println("**ServletB-service() started");
RequestDispatcher rd=req.getRequestDispatcher("c.jlc");
rd.forward(req, res);
System.out.println("**ServletB service() completed");
}
}