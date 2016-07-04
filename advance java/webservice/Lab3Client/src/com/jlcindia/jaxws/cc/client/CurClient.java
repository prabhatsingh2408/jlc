package com.jlcindia.jaxws.cc.client;

//import java.util.Currency;

public class CurClient {
public static void main(String[] args) {
	CurrencyConvertor cc=new CurrencyConvertor();
	CurrencyConvertorSoap ccs= cc.getCurrencyConvertorSoap();
	double d=ccs.conversionRate(Currency.USD,Currency.USD);
	System.out.println(d);
	d=ccs.conversionRate(Currency.GBP,Currency.INR);
	System.out.println(d);
}
}
