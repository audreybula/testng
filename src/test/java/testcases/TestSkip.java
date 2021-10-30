package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	@Test
	public void isSkip() {
		
		throw new SkipException("Skiiping the test as the condition is not met");
	}

}
