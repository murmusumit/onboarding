package com.amdocs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private Hello hello;
	private String actualResponse;
	
	@Given("I have created a hello object")
	public void i_have_created_a_hello_object() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@When("I invoke the sayHello method on the hello object")
	public void i_invoke_the_sayHello_method_on_the_hello_object() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Then("I expect the response as {string}")
	public void i_expect_the_response_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
}



}
