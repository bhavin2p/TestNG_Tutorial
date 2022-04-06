package testAcademy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterization {
	
	public WebDriver driver;
	public String testURL = "http://www.swtestacademy.com/";
	
	@BeforeSuite
    public void setupSuite () {
        System.out.println("@BeforeSuite started.");
    }
	
	@BeforeTest
    public void setupTests () {
        System.out.println("@BeforeTest started.");
    }
	
	@BeforeClass
    public void setupClass () {
        System.out.println("@BeforeClass started.");
    }
	
	@BeforeMethod
	@Parameters("browser")
    public void setupTest (String browser){
        //Print console that code is in @BeforeMethod!
        System.out.println("@BeforeMethod has started.");
        //Create a new ChromeDriver
        
        if(browser.equals("chrome")){
        	WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
        	WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("You set a wrong browser parameter!");
        }
    }
	
	@Test
    public void firstTest () {
        System.out.println("First Test is Started.");
        //Go to www.swtestacademy.com
        driver.get(testURL);
        //Get page title
        String title = driver.getTitle();
        //Print page's title
        System.out.println("Page Title: " + title);
    }
	
	@Test
    public void secondTest () {
        System.out.println("Second Test is Started.");
        //Go to www.amazon.com
        driver.get("https://www.amazon.com/");
        //Get page title
        String title = driver.getTitle();
        //Print page's title
        System.out.println("Page Title: " + title);
    }
	
	@AfterMethod
    public void teardownTest (){
        System.out.println("@AfterMethod has started.");
        //Close browser and end the session
        driver.quit();
    }

    @AfterClass
    public void teardownClass (){
        System.out.println("@AfterClass has started.");
    }

    @AfterTest
    public void teardownTests (){
        System.out.println("@AfterTest has started.");
    }

    @AfterSuite
    public void teardownSuite (){
        System.out.println("@AfterSuite has started.");
    }

	
	
	
}
