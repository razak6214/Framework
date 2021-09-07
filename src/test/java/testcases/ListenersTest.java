package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot" + name + ".png");
		try { 
			FileUtils.copyFile(src, dest);
			FileHandler.copy(src, dest);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
