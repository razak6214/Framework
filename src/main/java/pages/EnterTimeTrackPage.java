package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage extends BasePage{
	
	//initialization
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(id = "logoutLink")
	private WebElement logoutBtn;
	
	//Utilization
	public void clickLogoutButton()
	{
		logoutBtn.click();
	}
}
