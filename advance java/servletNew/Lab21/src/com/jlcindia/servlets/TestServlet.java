package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet {
protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	System.out.println("TestServlet ->service()");
	System.out.println("Accessing session object");
	HttpSession sess=req.getSession();
	String eml=req.getParameter("email");
	ServletContext ctx=getServletContext();
	System.out.println("Storing Attribute in context");
	ctx.setAttribute("email", eml);
	System.out.println("Replacing attribute in context");
	ctx.setAttribute("email","prabhat@gmail.com");
	System.out.println("Removing attribute in context");
	ctx.removeAttribute("email");
	System.out.println("Invalidating Session Object");
	sess.invalidate();
	Writer out=res.getWriter();
	out.write("<h1>Verify the server console");
}
}
