import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider(name="dp1")
	public static Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "raman";
		data[0][1] = "drfvfdb";
		
		data[1][0] = "rahul";
		data[1][1] = "erdvsd";
		
		return data;
		
	}
	
	@DataProvider(name="dp2")
	public static Object[][] getData2() {
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "raman";
		data[0][1] = "drfvfdb";
		data[0][2] = "mail1";
		
		data[1][0] = "rahul";
		data[1][1] = "erdvsd";
		data[1][2] = "mail2";
		
		return data;
		
	}

}
