package com.jlcindia.jaxws.stock;

public class StockClient {
public static void main(String[] args) {
	StockQuote sq=new StockQuote();
	StockQuoteSoap sqs=sq.getStockQuoteSoap();
	String s=sqs.getQuote("INFY");
	System.out.println(s);
	s=sqs.getQuote("ORCL");
	System.out.println(s);
	s=sqs.getQuote("MSFT");
	System.out.println(s);
}
}
