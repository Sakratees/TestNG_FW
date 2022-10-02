package testCase;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import base.baseClass;
import pages.homePage;

public class home_tc extends baseClass 
{
	@Test
	public void testcase2() throws InterruptedException 
	{		
		homePage hp = PageFactory.initElements(driver, homePage.class);
		Thread.sleep(5000);
		hp.click_transfer(); 
		Thread.sleep(3000);
		hp.click_transfer_bt_acc();
		hp.verify_transfer_bt_acc_page();

		Reporter.log("========User navigated to tansfer page successfully=========",true);
	}

}
