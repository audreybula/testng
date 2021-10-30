import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m) {
		
		Object[][] data = null;
		
		if(m.getName().equals("testLogin")) {
			
			data = new Object[2][2];
			
			data[0][0] = "raman";
			data[0][1] = "drfvfdb";
			
			data[1][0] = "rahul";
			data[1][1] = "erdvsd";
			
		} else if(m.getName().equals("testUserReg")) {
			
			data = new Object[2][3];
			
			data[0][0] = "raman";
			data[0][1] = "drfvfdb";
			data[0][2] = "mail1";
			
			data[1][0] = "rahul";
			data[1][1] = "erdvsd";
			data[1][2] = "mail2";
			
		}
		
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
