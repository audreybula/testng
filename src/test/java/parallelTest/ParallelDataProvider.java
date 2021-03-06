package parallelTest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProvider {
	
	@Test(dataProvider = "getData")
	public void doLogin(String browser) throws InterruptedException {
		
		Date d = new Date();
		System.out.println("Broswer name is: " + browser + " " + d);
		Thread.sleep(2000);
		
	}
	
	@DataProvider(parallel = true)
	public Object[][] getData() {
		
		Object[][] data = new Object[2][1];
		
		data[0][0] = "chrome";
		data[1][0] = "firefox";
		
		return data;
		
	}

}
