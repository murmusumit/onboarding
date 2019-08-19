package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testSayhello() {
		
		Hello hello = new Hello();
		String expectedResponse = "Hello Maven!";
		String actualResponse = hello.sayHello();
		assertEquals ( expectedResponse, actualResponse);
		
		
	}
	
}
