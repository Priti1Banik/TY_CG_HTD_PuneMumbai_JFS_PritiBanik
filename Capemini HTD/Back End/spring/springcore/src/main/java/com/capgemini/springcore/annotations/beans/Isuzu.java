package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class Isuzu implements Engine {

	public double getCC() {
		return 1700;
	}

	public String getType() {
		return "4-Stroke Petrol";
	}

}
