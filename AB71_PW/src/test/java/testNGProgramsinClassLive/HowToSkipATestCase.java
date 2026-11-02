package testNGProgramsinClassLive;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class HowToSkipATestCase
{
	
	@Test(dependsOnMethods="loginCode")
	public void logoutCode()
	{
		System.out.println("This is my logout code");
	}
	
	@Test
	public void loginCode()
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		Reporter.log("Browser Engine is launched  Successfully");
		page.navigate("https://www.flipkart.com");
		Reporter.log("URL is launched  Successfully");
		page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("✕")).click();
		Reporter.log("Using website as Guest");
		page.waitForTimeout(4000);	
	//	Assert.assertEquals(false, true);
	}
}
