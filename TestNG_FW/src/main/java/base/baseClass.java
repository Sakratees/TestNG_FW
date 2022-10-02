package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.*;

import utils.*;

public class baseClass 
{	
	public static WebDriver driver = null;	
	public static WebDriverWait wait = null; 
	public static String browserName = null;
	public static String url = null;
	public static String username_txt = null;
	public static String password_txt = null;
	public static String user_txt = null;
	public static String amt_txt = null;
	public static String des_txt = null;
	public static String responce_txt = null;
	public static String homePageTitle_txt = null;

	@BeforeSuite
	public void browserSetup()
	{

		String projPath = System.getProperty("user.dir");
		propertyReader.loadAllProperties();				

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",projPath+"/driver/chrome/chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
			driver.manage().window().maximize();			
			driver.get(url);			
			Reporter.log("=======Browser Application Started==========", true);
		}
		else
		{
			System.out.println("Other browser needs to be implemented");
		}
	}

	@AfterSuite
	public void tearDown()
	{
		driver.quit();
		Reporter.log("=======Browser Session Ends==========", true);
	}
}
