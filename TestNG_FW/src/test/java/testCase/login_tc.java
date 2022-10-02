package testCase;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import base.baseClass;
import pages.loginPage;
import utils.helperMethods;

public class login_tc extends baseClass
{	
	@Test
	public void testcase1() throws InterruptedException 
	{

		loginPage lp = PageFactory.initElements(driver, loginPage.class);		
		lp.enter_username(baseClass.username_txt);
		lp.enter_pwd(baseClass.password_txt);
		lp.click_login();
		helperMethods.verify_page_title(baseClass.homePageTitle_txt);

		Reporter.log("========Logged in to the application successfully=========", true);
	}

}
