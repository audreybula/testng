package customListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestSuccess(ITestResult result) {

		System.out.println("Capturing Screenshot for passed test: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(
				"<a href=\"/Users/admin/Desktop/dev/selenium/testng/src/screenshot/random.jpeg\">Screenshot Link</a>");

	}

}
