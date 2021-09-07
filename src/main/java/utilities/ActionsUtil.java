package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsUtil {
	
	public static void click(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.click(element);
	}
	
	public static void DoubleClick(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(element);
	}
	
	public static void MovetoElement(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}
}
