package regionregressionpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class RegionalRegression2Test extends BaseClass{
	
	@Test(groups = "Smoke")
	public void createAccount2()
	{
		System.out.println("Account has been created");
	}
	
	@Test(groups = "Regression")
	public void accountEdit2()
	{
		Reporter.log("Account has been edited", true);
	}
	
	@Test(groups = "Smoke")
	public void accountDeleted2()
	{
		System.out.println("Account has been deleted");
	}
	
	@Test(groups = "Regression")
	public void createNomineeAccount2()
	{
		System.out.println("Nominee account has been created for this account");
	}

}
