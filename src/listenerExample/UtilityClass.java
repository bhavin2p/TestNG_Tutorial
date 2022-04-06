package listenerExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {

	public static WebDriver driver=null;
	static String pathString = "C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\Documents\\Workspace\\TestNG_Tutorial\\Screenshots";

	public static void getScreenshot(String name, WebDriver driver){

		try {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(pathString + "\\name_" + System.currentTimeMillis()+".png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
