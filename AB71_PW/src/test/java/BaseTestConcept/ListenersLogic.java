package BaseTestConcept;

import java.nio.file.Paths;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ListenersLogic implements ITestListener
{
	

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		BaseTest test=		(BaseTest) result.getInstance();
		test.page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\test-output\\screenshot\\Pass\\Pass"+Math.random()+".png")));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		//Logic should start from here
		BaseTest test=		(BaseTest) result.getInstance();

       test. page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\test-output\\screenshot\\Fail\\Fail"+Math.random()+".png")));

	}




}
