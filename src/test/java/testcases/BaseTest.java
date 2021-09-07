package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constant.AutoConstant;

public class BaseTest implements AutoConstant
{
	 static WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(ChromeKey, Chromevalue);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}

}
