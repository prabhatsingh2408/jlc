package com.jlcindia.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RemoveServlet extends HttpServlet{
protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	String bnm=req.getParameter("bname");
	Cookie cs[]=req.getCookies();
	Writer out=res.getWriter();
	if(cs==null){
		out.write("<h2> You are New Client");
		HttpSession sess=req.getSession();
	}else{
		boolean found=false;
		for(Cookie c:cs){
			String nm=c.getName();
			String val=c.getValue();
			if(nm.equals("JSESSIONID")){
				found=true;
				out.write("<h2>"+nm+" :"+val);
			}else if(nm.equals(bnm)){
				c.setMaxAge(0);
				res.addCookie(c);
			}else
				out.write("<h2>"+nm+" :"+val);
		}
		if (found){
			out.write("<h2>You are old Client");
		}else{
			out.write("<h2>You are new Client");
			HttpSession sess=req.getSession();
		}
	}
	out.write("<hr/>");
	RequestDispatcher rd=req.getRequestDispatcher("index.html");
	rd.include(req, res);
}
}