package testNGProgramsinClassLive;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class Two
{
	@Test
	public void method1()
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.flipkart.com");
		page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("✕")).click();
		page.waitForTimeout(4000);	
	}
}
