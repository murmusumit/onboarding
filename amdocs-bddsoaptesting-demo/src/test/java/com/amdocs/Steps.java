package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	@Given("I have deployed the RPNCalculator SOAP api at URL {string}")
	public void setSOAPWSDLURL(String wsdlURL) {
		soapWSDLURL = wsdlURL;
	}

	@Given("the input is {string}")
	public void the_input_is(String rpnMathExpression) {
	    this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the SOAP API")
	public void invokeRPNCalculatorSOAPAPI() {
	    RPNCalculatorService rpnWebService = new RPNCalculatorService();
	    RPNCalculator rpnCalculator = rpnWebService.getRPNCalculator();
	    
	    actualResult = rpnCalculator.evaluate ( rpnMathExpression );
	}

	@Then("I expect the response as {string}")
	public void verifyExpectedResult(String expectedResult) {
		double expectedResult = Double.parseDouble(strExpectedResult);
	    assertEquals ( expectedResult, actualResult );
	}


	
}
