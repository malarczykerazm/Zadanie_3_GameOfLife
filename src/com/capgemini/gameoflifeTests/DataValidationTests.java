package com.capgemini.gameoflifeTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.gameoflife.DataValidation;
import com.capgemini.gameoflife.WrongInputException;

public class DataValidationTests {
	
	@Test
	public void shouldReturnAnInteger() {
		String input = "12";
		assertEquals(12, DataValidation.dataVal(input));
	}
	
	@Test (expected = WrongInputException.class)
	public void shouldThrowAnExceptionWrongNumber() {
		String input = "12.5";
		assertEquals(WrongInputException.class, DataValidation.dataVal(input));
	}
	
	@Test (expected = WrongInputException.class)
	public void shouldThrowAnExceptionString() {
		String input = "abs12,5b!";
		assertEquals(WrongInputException.class, DataValidation.dataVal(input));
	}
	
}
