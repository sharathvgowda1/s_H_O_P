package org.smokeandregressionpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class RegionalRegressionExecution extends BaseClass{
	
	@Test(groups = "Smoke")
	public void createAccount()
	{
		System.out.println("Account has been created");
	}
	
	@Test(groups = "Regression")
	public void accountEdit()
	{
		Reporter.log("Account has been edited", true);
	}
	
	@Test(groups = "Smoke")
	public void accountDeleted()
	{
		System.out.println("Account has been deleted");
	}
	
	@Test(groups = "Regression")
	public void createNomineeAccount()
	{
		System.out.println("Nominee account has been created for this account");
	}

}
