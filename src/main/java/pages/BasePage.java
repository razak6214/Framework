package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage {
	
	public static WebDriver driver;
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	//To verify the page title
	public void verifyTitle(String eTitle) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching: "+eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			Assert.fail();
		}
	}
	
	//To verify the element
	public static void verifyElement(WebElement element) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present" + element.getText(),true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}
}