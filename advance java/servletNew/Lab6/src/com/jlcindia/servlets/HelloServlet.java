package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;

@WebServlet(
		name="helloServ",
		urlPatterns={"/hello.jlc"},
		initParams={
	@WebInitParam(
			name="email",
			value="hellosri@jlc.com"
			)
		}
		)
public class HelloServlet extends HttpServlet {
ServletConfig cfg=null;
@Override
public void init(ServletConfig cfg)throws ServletException{
	this.cfg=cfg;
	System.out.println("**init()method of HelloServlet");
}
protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
System.out.println("**service()  method of HelloServlet");
String fnm=req.getParameter("fname");
String phn=req.getParameter("phone");
Writer out=res.getWriter();
res.setContentType("text/html");
out.write("<h1>Response from HelloServlet");
out.write("<hr/>Request Parameters");
out.write("<br/>Fname :"+fnm);
out.write("<hr/>phone :"+phn);
out.write("<hr/>Servlet Config Parameters");
String eml=cfg.getInitParameter("email");
out.write("<br/>"+cfg);
out.write("<br/>Email :"+eml);
out.write("<hr/>Servlet Context Parameters");
ServletContext ctx=cfg.getServletContext();
String web=ctx.getInitParameter("website");
out.write("<br/>"+ctx);
out.write("<br/>WEB :"+web);
}
}