package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test(priority = 2, dependsOnMethods = "doUserReg")
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	@Test(priority = 1)
	public void doUserReg() {
		
		System.out.println("Executing user reg test");
		Assert.fail("User not registered successfully");
		
	}
	
	@Test(priority = 3, dependsOnMethods = "doUserReg", alwaysRun = true)
	public void thirdTest() {
		
		System.out.println("Executing third test");
		
	}
	
	@Test(priority = 4, dependsOnMethods = "doUserReg")
	public void fourthTest() {
		
		System.out.println("Executing fourth test");
		
	}

}
