package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
private Calculator calculator = null;

@BeforeEach
public void createObject() {
	calculator = new Calculator();
}
	@Test
	public void addTest() {
		
		int i = calculator.add(10, 20);
		assertEquals(30, i);
	}

	@Test
	public void subTest() {
		int i = calculator.sub(20, 10);
		assertEquals(10, i);
	}

	@Test
	public void mulTest() {
		int i = calculator.mul(10, 20);
		assertEquals(200, i);
	}

	@Test
	public void divTest() {
		int i = calculator.div(200, 20);
		assertEquals(10, i);
	}

	@Test
	public void divTest1() {
		assertThrows(ArithmeticException.class, () -> calculator.div(10, 0)); // this assertThrows() is use to handle exception
	}
}
