package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.helperMethods;

public class loginPage 
{
	 
	@FindBy(how=How.CSS, using="input[placeholder*='Enter username or email address']")
	WebElement username;

	@FindBy(how = How.CSS, using = "input[placeholder*='Enter password']")
	WebElement pwd;

	@FindBy(how = How.XPATH, using = "//button[text()=' Sign In ']")
	WebElement login_button;

	public void enter_username(String value) 
	{
		helperMethods.key_in(username, value);
	}

	public void enter_pwd(String value) 
	{
		helperMethods.key_in(pwd, value);
	}

	public void click_login() 
	{
		helperMethods.click(login_button);
	}

}
