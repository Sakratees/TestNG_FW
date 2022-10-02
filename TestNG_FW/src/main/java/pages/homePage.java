package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.helperMethods;

public class homePage 
{
	@FindBy(how=How.XPATH, using="//label[text()='Transfers']")
	WebElement transfer;

	@FindBy(how=How.XPATH, using="//div[text()='Transfer Between Accounts']")
	WebElement transfer_bt_acc;		

	public void click_transfer() 
	{				
		helperMethods.click(transfer);
	}

	public void click_transfer_bt_acc() 
	{
		helperMethods.click(transfer_bt_acc);
	}

	public void verify_transfer_bt_acc_page() 
	{
		Assert.assertTrue(helperMethods.element_visibility(transfer_bt_acc),"Home page verified successfully");
	}

}
