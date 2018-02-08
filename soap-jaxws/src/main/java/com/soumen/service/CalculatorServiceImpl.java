package com.soumen.service;

import com.soumen.exceptions.NotAnIntegerException;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String add(String s1, String s2) throws NotAnIntegerException {
		int int1 = 0;
		int int2 = 0;
		try {
			int1 = Integer.parseInt(s1);
			int2 = Integer.parseInt(s2);
		} catch (Exception e) {
			throw new NotAnIntegerException();
		}

		return String.valueOf(int1 + int2);

	}

}
