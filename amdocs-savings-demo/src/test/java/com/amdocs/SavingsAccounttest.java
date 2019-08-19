package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SavingsAccounttest {
	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setUp() {
		account = new SavingsAccount();
		
		//Partial mocking or spying
		accountSpy = spy ( account );
	}
	@Ignore
	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		
		
		//Stubbing - hard coding the response of getBalance method
		doReturn ( 5000.00 ).when ( accountSpy ).getBalance();
		doNothing().when( accountSpy ).updateBalanceIntoDB( anyDouble() );
		
		double updatedBalance = accountSpy.withdraw ( 1000.00 );
		double expectedBalance  = 4000.00;
		
		assertEquals ( expectedBalance, updatedBalance, 0.0001 );
		
		//Check if getBalance method was invoked exactly 1 time within withdraw method
		verify( accountSpy, times(1) ).getBalance();
	
		//
		verify( accountSpy, times(1) ).updateBalanceIntoDB( anyDouble() );
		
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		
		boolean exceptionThrown = false;
		//Stubbing - hard coding the response of getBalance method
		doReturn ( 5000.00 ).when ( accountSpy ).getBalance();
		//Stubbing - hard coding the response of updatedBalanceIntoDB method
		doNothing().when( accountSpy ).updateBalanceIntoDB( anyDouble() );
		
		try {
			accountSpy.withdraw( 10000.00 );
		}
		catch (InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		
		//Check if getBalance method was invoked exactly 1 time within withdraw method
		verify( accountSpy, times(1) ).getBalance();
	
		//Check if updatedBalanceIntoDb method was never invoked within withdraw
		verify( accountSpy, times(0) ).updateBalanceIntoDB( anyDouble() );
		
	}

}
