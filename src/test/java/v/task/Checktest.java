package v.task;

import org.testng.annotations.Test;

import pages.checks;


public class Checktest extends testBase 
{

	checks checkObject;
	
	

	@Test (priority = 1)
	public void userCanValidateksa() throws InterruptedException 
	{
		checkObject = new checks(driver);
		checkObject.packagesksa();
	}
	@Test(priority = 2)
	public void userCanValidatekwt() throws InterruptedException 
	{
		checkObject = new checks(driver);
		checkObject.packageskWT();

	}
	@Test (priority = 3)
	public void userCanValidateBHRN() throws InterruptedException 
	{
		checkObject = new checks(driver);
		checkObject.packagesBHRN();
	}
		
		

	}

