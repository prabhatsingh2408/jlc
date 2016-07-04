package com.client;

import com.dev.AccountServiceDelegate;
import com.dev.AccountServiceService;

public class Lab2Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccountServiceService ass=new AccountServiceService();
		AccountServiceDelegate asd=ass.getAccountServicePort();
		
		double d = asd.getBal(101);
		System.out.println(d);
		System.out.println("*****************");
		d = asd.getBal(99);
		System.out.println(d);
		System.out.println("*****************");
		asd.deposit(101,5000.0);
		System.out.println("*****************");
		asd.withdraw(99,5000.0);
	}

}
