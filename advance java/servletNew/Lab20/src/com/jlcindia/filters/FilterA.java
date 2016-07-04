package com.jlcindia.filters;
import java.io.*;
import javax.servlet.*;

public class FilterA implements Filter {
	public void destroy(){
		System.out.println("***FilterA Destroy()");
	}

public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException{
System.out.println("**FilterA-doFilter()-started");
chain.doFilter(req, res);
System.out.println("**FilterA-doFilter()-completed");
}
public void init(FilterConfig fconfig){
	System.out.println("FilterA init()");
}
}