package com.jlcindia.filters;
import java.io.*;
import javax.servlet.*;

public class FilterC implements Filter {
	public void destroy(){
		System.out.println("***FilterC Destroy()");
	}

public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException{
System.out.println("**FilterC-doFilter()-started");
chain.doFilter(req, res);
System.out.println("**FilterC-doFilter()-completed");
}
public void init(FilterConfig fconfig)throws ServletException{
	System.out.println("FilterC init()");
}
}