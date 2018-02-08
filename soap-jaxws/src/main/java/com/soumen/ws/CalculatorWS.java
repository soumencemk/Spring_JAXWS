package com.soumen.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soumen.exceptions.NotAnIntegerException;
import com.soumen.service.CalculatorService;

@WebService(serviceName="CalculatorService")
public class CalculatorWS {

	private CalculatorService calculatorService;

	@WebMethod
	public String addNumbers(String s1, String s2) throws NotAnIntegerException {
		return calculatorService.add(s1, s2);

	}

	@WebMethod(exclude = true)
	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

}
