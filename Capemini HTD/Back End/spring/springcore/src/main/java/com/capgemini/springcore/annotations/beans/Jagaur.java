package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class Jagaur implements Engine{

	@Override
	public double getCC() {
		return 1300;
	}

	@Override
	public String getType() {
		return "4-Stroke diesel";
	}

}
