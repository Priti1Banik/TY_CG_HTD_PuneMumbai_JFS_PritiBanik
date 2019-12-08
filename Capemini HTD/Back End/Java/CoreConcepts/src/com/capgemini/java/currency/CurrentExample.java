package com.capgemini.java.currency;

import java.util.Currency;
import java.util.Set;

public class CurrentExample {
public static void main(String[] args) {
	
	Currency currencycode1 = Currency.getInstance("INR");   //select(display) the mentioned currency
	Currency currencycode2 = Currency.getInstance("USD");
	
	String currencycode1Symbol = currencycode1.getSymbol();   //give the symbol of currency
	String currencycode2Symbol = currencycode2.getSymbol();
	
	System.out.println("Symbol for INR is: "+currencycode1Symbol);
	System.out.println("Symbol for USD is: "+currencycode2Symbol);
	System.out.println("*******************************************");
	
	String currencycode1DisplayName = currencycode1.getDisplayName();  //give the name of the countryS
	String currencycode2DisplayName = currencycode2.getDisplayName();
	
	System.out.println("Display name for INR: "+currencycode1DisplayName);
	System.out.println("Display name for USD: "+currencycode2DisplayName);
	System.out.println("********************************************");
	
	Set<Currency> currencies = Currency.getAvailableCurrencies();    // displays all the currencies
			
	System.out.println(currencies);
	System.out.println("********************************************");
	
	int currentCode1Defaultvalue1 = currencycode1.getDefaultFractionDigits();
	int currentCode1Defaultvalue2 = currencycode1.getDefaultFractionDigits();
	System.out.println(currentCode1Defaultvalue1);
	System.out.println(currentCode1Defaultvalue2);
}
}
