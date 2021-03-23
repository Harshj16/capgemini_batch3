package com.capgemini.tdddemoapp.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	private static String ANY_SINGLE_NUMBER_IN_STRING = "500";
	private static int SAME_NUMBER_IN_INTEGER = 500;

	@Test
	public void test_calculate_GivenEmptyString_ShouldReturnZero() {
		StringCalculator stringCalculator = new StringCalculator();
		int result =stringCalculator.calculate("");
		assertEquals(0, result);
	}
	
	@Test
	public void test_calculate_GivenAnySingleNumberAsString_ShouldReturnSameNumberAsNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		int result =stringCalculator.calculate(ANY_SINGLE_NUMBER_IN_STRING);
		assertEquals(SAME_NUMBER_IN_INTEGER, result);
	}
	@Test
	public void test_calculate_Given1and2AsStringSeparatedByComma_ShouldReturn3AsNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		int result =stringCalculator.calculate("1,2");
		assertEquals(3, result);
	}
	@Test
	public void test_calculate_Given10and20AsStringSeparatedByComma_ShouldReturn30AsNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		int result =stringCalculator.calculate("10,20");
		assertEquals(30, result);
	}
	@Test
	public void test_calculate_Given10and20and30AsStringSeparatedByComma_ShouldReturn60AsNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		int result =stringCalculator.calculate("10,20,30");
		assertEquals(60, result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void test_calculate_GivenAandBSeparatedByComma_ThrowNumberFormatException() {
		StringCalculator stringCalculator = new StringCalculator();
		int result =stringCalculator.calculate("A,B");
		
	}

}
