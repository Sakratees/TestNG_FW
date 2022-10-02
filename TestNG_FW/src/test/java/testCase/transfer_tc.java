package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import base.baseClass;
import pages.transfer_page;

public class transfer_tc extends baseClass
{
	@Test
	public void testcase3() throws InterruptedException 
	{

		transfer_page tp = PageFactory.initElements(driver, transfer_page.class);		
		tp.select_username();
		tp.select_debit_acc();
		tp.select_credit_acc();
		tp.enter_amount(amt_txt);
		tp.enter_des(des_txt+" "+amt_txt+"EUR");
		tp.click_continue();
		tp.click_continue();
		tp.verify_response_message(responce_txt);
		tp.click_logout();

		Reporter.log("========Transfer completed successfully=========", true);
	}
}
