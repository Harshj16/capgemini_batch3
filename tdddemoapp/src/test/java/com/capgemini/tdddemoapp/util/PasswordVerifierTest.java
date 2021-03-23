package com.capgemini.tdddemoapp.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordVerifierTest {
	
	private PasswordVerifier passwordVerifier;
	
	@Before
	public void setup() {
		passwordVerifier=new PasswordVerifier();
	}

	@Test
	public void test_varify_Given7CharacterPassword_ShouldRetunInvalidPassword() {
		String result = passwordVerifier.verify("abcdefg");
		assertEquals("Invalid Password", result);
	}

}
