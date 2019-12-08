package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void factTest() {
		Factorial f = new Factorial();
		int i = f.fact(5);
		assertEquals(120, i);
	}
	@Test
	public void factTest1() {
		Factorial f = new Factorial();
		int i = f.fact(0);
		assertEquals(1, i);
	}
	@Test
	public void factTest2() {
		Factorial f = new Factorial();
		int i = f.fact(-5);
		assertEquals(1, i);
	}
}
