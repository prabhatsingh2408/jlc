package com.jlcindia.Junit3;

import junit.framework.TestCase;
import com.jlcindia.*;

public class HelloTest extends TestCase {
    Hello hello=null;  //Resource Declaration
    
	protected void setUp() throws Exception {
        System.out.println("setUp()");
		super.setUp();
		hello=new Hello();  //Resource Initialization
	}

	protected void tearDown() throws Exception {
		System.out.println("teraDown()");
		super.tearDown();
		hello=null;   //Resource cleanup
	}
    public void testGetMassage1(){
    	System.out.println("testGetMassage1()");
    	String str=hello.getMessage1();
    	assertNotNull(str);
    }
        public void testGetMassage2(){
    	System.out.println("testGetMassage2()");
    	String str=hello.getMessage2();
    	assertNotNull(str);
    }
}
