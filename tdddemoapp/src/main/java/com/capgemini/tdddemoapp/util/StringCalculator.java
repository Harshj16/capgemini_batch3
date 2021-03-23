package com.capgemini.tdddemoapp.util;

import java.util.Arrays;

public class StringCalculator {

	public int calculate(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else if(input.indexOf(",")!=-1) {
			return sumCalculationForCommaSeparatedNumbers(input);
		}
		else {
			return Integer.parseInt(input);
		}
		
	}

	private int sumCalculationForCommaSeparatedNumbers(String input) {
		String [] tokens = input.split(",");
		int sum=0;
		for (String token : tokens) {
			
			sum = checkTokenInputType(sum, token);
		}
		return sum;
	}

	private int checkTokenInputType(int sum, String token) {
		try {
			int value=Integer.parseInt(token);
			sum+=value;
		}
		catch(NumberFormatException e) {
			throw new NumberFormatException();
		}
		return sum;
	}

}
