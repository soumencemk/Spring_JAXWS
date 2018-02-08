package com.soumen.service;

import com.soumen.exceptions.NotAnIntegerException;

public interface CalculatorService {

	public String add(String s1, String s2) throws NotAnIntegerException;

}
