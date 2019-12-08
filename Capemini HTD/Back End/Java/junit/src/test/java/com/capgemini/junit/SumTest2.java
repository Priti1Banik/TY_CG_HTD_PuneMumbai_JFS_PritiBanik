package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest2 {

	@Test
	public void addTest() {
		Sum2 s = new Sum2();
		int i = s.add(10, 20, 30);
		assertEquals(60, i);
	}

}
