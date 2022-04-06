package testAcademy;

import org.testng.annotations.Test;

public class TestNGdataProvider {
	
	
	
	//dataProviderClass is used to access DataProvider from other class
	@Test(dataProviderClass = dataProvider.class, dataProvider = "testdata")
	public void dataProviderTest(String name, String pass) {
		System.out.println("Test is started.....");
		
		System.out.println("UserName = " +name);
		System.out.println("Password = " +pass);
		
	}
	
	
	

}
