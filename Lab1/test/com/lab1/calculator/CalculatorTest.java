package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	@Test
	public void addTest()
	{
		assertEquals(4, calculator.add(2, 2));
	}

	@Test
	public void subtractTest()
	{
	assertEquals(1, calculator.subtract(2, 1));	
	}
	
	@Test
	public void DivideTest()
	{
	assertEquals(1, calculator.divide(2, 2));	
	}	
	
	@Test
	public void MultiplyTest()
	{
	assertEquals(4, calculator.multiply(2, 2));	
	}
	
	@Test
	public void isEqualTest()
	{
		assertTrue(calculator.isEqual(2, 2));
		assertFalse(calculator.isEqual(2, 1));
	}
	
}
