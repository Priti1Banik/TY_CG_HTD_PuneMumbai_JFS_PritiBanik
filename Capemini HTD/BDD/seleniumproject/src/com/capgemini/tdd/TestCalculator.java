package com.capgemini.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

	@Test
	public void addTest() {
		Calculator cal =  new Calculator();
		int a = 10;
		int b = 20;
		int expected = 30;
		int actual = cal.add(10,20);
		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void subTest() {
		Calculator cal =  new Calculator();
		int a = 20;
		int b = 10;
		int expected = 10;
		int actual = cal.sub(20,10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void mulTest() {
		Calculator cal =  new Calculator();
		int a = 20;
		int b = 10;
		int expected = 200;
		int actual = cal.mul(20,10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void divTest() {
		Calculator cal =  new Calculator();
		int a = 200;
		int b = 10;
		int expected = 20;
		int actual = cal.div(200,10);
		Assert.assertEquals(expected, actual);
	}
}