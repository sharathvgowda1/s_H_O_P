package org.smokeandregressionpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class BatchExecutionPracticeTest extends BaseClass{
	
	@Test
	public void createAccount()
	{
		System.out.println("Account has been created");
	}
	
	@Test
	public void accountEdit()
	{
		Reporter.log("Account has been edited", true);
	}
	
	@Test
	public void accountDeleted()
	{
		System.out.println("Account has been deleted");
	}
	
	@Test
	public void createNomineeAccount()
	{
		System.out.println("Nominee account has been created for this account");
		System.out.println("for poll execution");
	}

}
