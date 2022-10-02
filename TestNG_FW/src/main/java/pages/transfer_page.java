package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.helperMethods;

public class transfer_page 
{
	@FindBy(how = How.XPATH, using = "//ng-select[@ng-reflect-placeholder='Select a user']")
	WebElement user_select;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Mary Johnson')]")
	WebElement user_select_value;

	@FindBy(how = How.XPATH, using = "//app-account-select[@ng-reflect-select-label='Debit from *']//div[@class='ng-placeholder']")
	WebElement select_debit_account;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'EBQ12123423456')]")
	WebElement select_debit_value;

	@FindBy(how = How.XPATH, using = "//app-account-select[@ng-reflect-select-label='Credit to *']//div[@class='ng-placeholder']")
	WebElement select_credit_account;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'EBQ11123412345')]")
	WebElement select_credit_value;

	@FindBy(how = How.CSS, using = "input[title*='Outgoing Amount']")
	WebElement amount;

	@FindBy(how = How.CSS, using = "#description")
	WebElement description;

	@FindBy(how = How.CSS, using = "button[type*='submit']")
	WebElement submit;

	@FindBy(how = How.CSS, using = "div[class*='popup-message']")
	WebElement success_message;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Log Out')]")
	WebElement log_out;

	public void select_username() 
	{
		helperMethods.select_by_value(user_select, user_select_value);
	}

	public void select_debit_acc() 
	{
		helperMethods.select_by_value(select_debit_account, select_debit_value);
	}

	public void select_credit_acc() 
	{
		helperMethods.select_by_value(select_credit_account, select_credit_value);
	}

	public void enter_amount(String value) 
	{
		helperMethods.key_in(amount, value);
	}

	public void enter_des(String value) 
	{
		helperMethods.key_in(description, value);
	}

	public void click_continue() 
	{
		helperMethods.click(submit);
	}

	public void verify_response_message(String value) 
	{
		helperMethods.get_text_and_verify(success_message, value);
	}

	public void click_logout() 
	{
		helperMethods.click(log_out);
	}

}
