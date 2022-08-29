package utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite(groups = {"Smoke","Regression"})
	public void connectDB() {
		System.out.println("*****connect to database");
	}
	
	@BeforeClass(groups = {"Smoke","Regression"})
	public void browserLaunch()
	{
		System.out.println("-----Launch the browser-----");
	}
	
	@BeforeMethod(groups = {"Smoke","Regression"})
	public void loginToApp()
	{
		System.out.println("++++++Login to application++++++");
	}
	
	@AfterMethod(groups = {"Smoke","Regression"})
	public void logoutFromApp() {
		System.out.println("logout from application");
	}
	
	@AfterClass(groups = {"Smoke","Regression"})
	public void browserClose() {
		System.out.println("close the browser");
	}
	
	@AfterSuite(groups = {"Smoke","Regression"})
	public void disconnectFromDB() {
		System.out.println("close the database connection");
	}

}
