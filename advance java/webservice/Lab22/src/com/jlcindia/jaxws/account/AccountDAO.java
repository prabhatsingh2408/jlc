package com.jlcindia.jaxws.account;

public class AccountDAO {

public void deposit(int accno,double amt){
	System.out.println("ADAO-deposit()");
	System.out.println(accno+"\t"+amt);
}
public void withdraw(int accno,double amt){
	System.out.println("ADAO-withdraw()");
	System.out.println(accno+"\t"+amt);
}
}
