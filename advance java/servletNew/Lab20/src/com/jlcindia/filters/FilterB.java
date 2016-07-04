package com.jlcindia.filters;
import java.io.*;
import javax.servlet.*;

public class FilterB implements Filter {
	public void destroy(){
		System.out.println("***FilterB Destroy()");
	}

public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException{
System.out.println("**FilterB-doFilter()-started");
chain.doFilter(req, res);
System.out.println("**FilterB-doFilter()-completed");
}
public void init(FilterConfig fconfig)throws ServletException{
	System.out.println("FilterB init()");
}
}