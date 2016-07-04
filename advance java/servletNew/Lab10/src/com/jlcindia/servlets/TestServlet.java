package com.jlcindia.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
	
	//1. Request parameters
	String un=req.getParameter("uname");
	String pw=req.getParameter("password");
	
	//2. Display Request Parameters
	PrintWriter out=res.getWriter();
	out.println("<h1>Username :"+un);
	out.println("<br/>Password :"+pw);
	out.println("<hr/>");
	out.println("Request Headers");
	
	//3.Request Headers
	Enumeration e=req.getHeaderNames();
	while(e.hasMoreElements()){
		String hn=e.nextElement().toString();
		String hv=req.getHeader(hn);
		out.println("<br/>"+hn+":"+hv);
	}
		out.println("<hr/>");
		out.println("Locale info");
		
		//4.Locales supported by browser
		out.println("<br/>req.getLocale() :"+req.getLocale());
		out.println("<hr/>");
		out.println("other info");
		
		//5.Other information from Request
		out.println("<br/>METHOD :"+req.getMethod());
		out.println("<br/>REQUEST URI :"+req.getRequestURI());
		out.println("<br/>REQUEST URL :"+req.getRequestURL());
		out.println("<br/>PROTOCOL :"+req.getProtocol());
		out.println("<br/>CONTENT LEN :"+req.getContentLength());
		out.println("<br/>CONTENT TYPE :"+req.getContentType());
		out.println("<br/>REMOTE ADDR :"+req.getRemoteAddr());
		out.println("<br/>REMOTE PORT :"+req.getRemotePort());
		out.println("<br/>REMOTE HOST :"+req.getRemoteHost());
		out.println("<br/>SERVER PORT :"+req.getServerPort());
		out.println("<br/>SERVER NAME :"+req.getServerName());
		out.println("<br/>QUERY STRING :"+req.getQueryString());
		out.println("<br/>req.getServletPath() :"+req.getServletPath());
		out.println("<br/>req.getContextPath() :"+req.getContextPath());
			}
}