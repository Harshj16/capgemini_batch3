package com.capgemini.tdddemoapp.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorTest {
	
	private PrimeFactor primeFactor;
	
	@Before	
	public void setup() {
		primeFactor=new PrimeFactor();
	}
	
	@Test
	public void test_calculatePimeFactor_Given0_ShouldReturnEmptyList() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(0);
		assertEquals(Arrays.asList(), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given1_ShouldReturnEmptyList() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(1);
		assertEquals(Arrays.asList(), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given2_ShouldReturn2() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(2);
		assertEquals(Arrays.asList(2), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given3_ShouldReturn3() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(3);
		assertEquals(Arrays.asList(3), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given4_ShouldReturn2And2() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(4);
		assertEquals(Arrays.asList(2,2), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given5_ShouldReturn5() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(5);
		assertEquals(Arrays.asList(5), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given6_ShouldReturn2And3() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(6);
		assertEquals(Arrays.asList(2,3), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given7_ShouldReturn7() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(7);
		assertEquals(Arrays.asList(7), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given8_ShouldReturn2And2And2() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(8);
		assertEquals(Arrays.asList(2,2,2), primeFactors);
	}
	@Test
	public void test_calculatePimeFactor_Given9_ShouldReturn3And3() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(9);
		assertEquals(Arrays.asList(3,3), primeFactors);
	}

	@Test
	public void test_calculatePimeFactor_Given10_ShouldReturn2And5() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(10);
		assertEquals(Arrays.asList(2,5), primeFactors);
		
	}
}
