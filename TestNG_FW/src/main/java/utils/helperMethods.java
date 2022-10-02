package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import base.baseClass;

public class helperMethods extends baseClass
{	

	public static void click(WebElement element)
	{		
		try {			
			wait.until(ExpectedConditions.elementToBeClickable(element));			
			element.click();
		}catch (Exception e) {
			Reporter.log("Unable to find the element"+ e);
		}		
	}

	public static void select_by_value(WebElement menu, WebElement sub_menu)
	{		
		try {			
			wait.until(ExpectedConditions.visibilityOf(menu));
			menu.click();
			sub_menu.click();			
		}catch (Exception e) {
			Reporter.log("Unable to find the element"+ e);
		}		
	}

	public static void select_by_index(WebElement element, int value)
	{		
		try {			
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
			Select sec = new Select(element);
			sec.selectByIndex(value);
		}catch (Exception e) {
			Reporter.log("Unable to find the element"+ e);
		}		
	}


	public static void key_in(WebElement element,String str)
	{		
		try {	
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(str);
		}catch (Exception e) {
			Reporter.log("Unable to find the element"+ e);
		}		
	}

	public static boolean element_visibility(WebElement element)
	{		
		boolean ret = false;
		try {	
			baseClass.wait.until(ExpectedConditions.visibilityOf(element));
			ret = element.isDisplayed();			
		}catch (Exception e) {
			Reporter.log("Unable to find the element"+ e);
		}
		return ret;		
	}

	public static void get_text_and_verify(WebElement element, String value)
	{		
		boolean ret = false;
		String res = null; 
		try {	
			baseClass.wait.until(ExpectedConditions.visibilityOf(element));				
			res = element.getText();
			if (res.contains(value))
			{
				ret = true;
			}
			Assert.assertTrue(ret);
		}catch (Exception e) {
			Reporter.log("Unable to find the element"+ e);
		}		
	}

	public static void verify_page_title(String value)
	{		
		try {						
			String actual = driver.getTitle();
			Assert.assertEquals(actual, value);
		}catch (Exception e) {
			Reporter.log("Title does not match with expected"+ e);
		}		
	}




}
