package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtil;

@Listeners()
public class VerifyVersionTest extends BaseTest{
	
	@Test
	public void testVersion() {
		//login page title
		String lpTitle = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"Login", 1, 2);
		
		//version comment
		String version = ExcelUtil.getData("C:\\Users\\S mohammed\\Project Management\\actitime\\src\\test\\resources\\testData\\input.xlsx", 
				"Login", 1, 3);
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyTitle(lpTitle);
		lp.verifyVersion(version);
	}
}