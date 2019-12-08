package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void addTest() {
		Sum s = new Sum();
		int i = s.add(10, 20);
		assertEquals(30, i);
	}
	@Test
	public void addTest1() {
		Sum s = new Sum();
		int i = s.add(-10, 20);
		assertEquals(10, i);
	}
	
}

