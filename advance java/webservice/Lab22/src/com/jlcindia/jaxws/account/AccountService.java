package com.jlcindia.jaxws.account;

public class AccountService {
AccountDAO adao=null;
public AccountService(){
	adao=new AccountDAO();
}

public void deposit(int accno,double amt){
	System.out.println("AS-deposit()");
	adao.deposit(accno, amt);
}
public void withdraw(int accno,double amt){
	System.out.println("AS-withdraw()");
	adao.withdraw(accno, amt);
}
}
