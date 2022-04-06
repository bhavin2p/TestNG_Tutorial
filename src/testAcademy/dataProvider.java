package testAcademy;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider(name = "testdata")
	public Object[][] loginData(){
		
		return new Object[][] {
			{"user1", "pass1"},{"user2", "pass2"}
		};
	}

}
