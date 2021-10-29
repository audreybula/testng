package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	
	@Test
	public void validateTitles() {
		
		System.out.println("Beginning");
		
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Validating title");
		softAssert.assertEquals(actual_title, expected_title);
		
		System.out.println("Validating img");
		softAssert.assertEquals(true, false, "image errored");
		
		System.out.println("Ending");
		
		softAssert.assertAll();
		
	}

}
