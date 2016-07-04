package com.jlcindia.jaxws.accountclient;

public class AccountClient {
public static void main(String[] args) {
	AccountServiceService ass=new AccountServiceService();
	AccountServiceDelegate asd=ass.getAccountServicePort();
	asd.getBal(101);
	GetBalResponse res= new GetBalResponse();
	double d=res.getReturn();
	System.out.println(d);
	
	//d=asd.getBal(99);
	System.out.println(d);
	asd.deposit(101,5000.0);
	asd.withdraw(99,5000.0);
}
}
