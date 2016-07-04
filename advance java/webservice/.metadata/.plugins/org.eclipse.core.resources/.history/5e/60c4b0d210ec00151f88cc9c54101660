package com.jlcindia.jaxws.account;

@javax.jws.WebService(targetNamespace = "http://account.jaxws.jlcindia.com/", serviceName = "AccountServiceService", portName = "AccountServicePort", wsdlLocation = "WEB-INF/wsdl/AccountServiceService.wsdl")
public class AccountServiceDelegate {

	com.jlcindia.jaxws.account.AccountService accountService = new com.jlcindia.jaxws.account.AccountService();

	public double getBal(int accno) {
		return accountService.getBal(accno);
	}

	public void deposit(int accno, double amt) {
		accountService.deposit(accno, amt);
	}

	public void withdraw(int accno, double amt) {
		accountService.withdraw(accno, amt);
	}

}