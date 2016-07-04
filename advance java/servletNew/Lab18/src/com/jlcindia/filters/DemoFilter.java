package com.jlcindia.filters;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebFilter(
		filterName="demoFilter",
		urlPatterns={"/demo.jlc"},
		initParams={@WebInitParam(name="city",value="Bangalore")}
		)
public class DemoFilter implements Filter {
public void init(FilterConfig fc)throws ServletException{
	System.out.println("**DemoFilter-init()");
	String ci=fc.getInitParameter("city");
	System.out.println(ci);
}

public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException{
System.out.println("**DemoFilter-doFilter()-before");
String nm=req.getParameter("name");
String em=req.getParameter("email");
String ip=req.getRemoteAddr();
System.out.println(nm);
System.out.println(em);
System.out.println(ip);
chain.doFilter(req, res);
System.out.println("**DemoFilter-doFilter()-After");
Object obj=req.getAttribute("MSG");
System.out.println(obj);
String msg=obj.toString();
System.out.println(msg);
}

public void destroy(){
	System.out.println("**DemoFilter Destroy()");
}
}
