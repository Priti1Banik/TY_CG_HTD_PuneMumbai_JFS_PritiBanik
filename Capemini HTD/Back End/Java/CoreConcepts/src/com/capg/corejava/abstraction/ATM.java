package com.capg.corejava.abstraction;

public interface ATM { // parent interface
/*
 * this method will be called when user insert the card;
 * this method will have card number and pin.
 * validate this card and get info
 */
	void validateCard();
	void getInfo();
}
