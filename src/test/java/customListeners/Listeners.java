package customListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
public void onTestSuccess(ITestResult result) {
		
		System.out.println("Capturing Screenshot for passed test: " + result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Capturing Screenshot for failed test: " + result.getName());
		
	}

}
