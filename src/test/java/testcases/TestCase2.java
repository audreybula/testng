package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void validateTitles() {
		
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		Assert.assertEquals(actual_title, expected_title);
	}

}
