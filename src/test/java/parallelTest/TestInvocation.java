package parallelTest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInvocation extends BaseTest {
	
	@Test(invocationCount = 5, threadPoolSize = 5)
	public void executeTest() {
		
		driver = getDriver("chrome");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
