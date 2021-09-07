package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtil;

@Listeners(ListenersTest.class)
public class InvalidLogintest extends BaseTest{
	
	@Test
	public void testInvalidLogin() {
		//username
		String un = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"Login", 2, 0);
		//password
		String pw = ExcelUtil.getData(
				"C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx",
			"Login", 2, 1);
		
		//login page title 
		String lptitle = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"Login", 1, 2);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.verifyTitle(lptitle);
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.ClickonLogin();
		lp.verifyErrormsg();
	}
}
