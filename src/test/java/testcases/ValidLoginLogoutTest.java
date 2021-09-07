package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.EnterTimeTrackPage;
import pages.LoginPage;
import utilities.ExcelUtil;

@Listeners(ListenersTest.class)
public class ValidLoginLogoutTest extends BaseTest {

	@Test
	public void testValidLoginLogout() {
		//username
		String un = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"Login", 1, 0); 
		System.out.println(un);
		
		//password
		String pw = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"Login", 1, 1); 
		
		//login page title
		String lpTitle = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"Login", 1, 2);
		
		//enter time track title
		String ett_title = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"EnterTImeTrack", 1, 0);
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyTitle(lpTitle);
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.ClickonLogin();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		etp.verifyTitle(ett_title);
		etp.clickLogoutButton();
		
		lp.verifyTitle(lpTitle);
	}
}
